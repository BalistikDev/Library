package com.springLibraryApplication.Library.controller;

import com.springLibraryApplication.Library.message.request.LoginForm;
import com.springLibraryApplication.Library.message.request.SignUpForm;
import com.springLibraryApplication.Library.message.response.JwtResponse;
import com.springLibraryApplication.Library.model.Role;
import com.springLibraryApplication.Library.model.RoleName;
import com.springLibraryApplication.Library.model.User;
import com.springLibraryApplication.Library.repository.RoleRepository;
import com.springLibraryApplication.Library.repository.UserRepository;
import com.springLibraryApplication.Library.security.jwt.JwtProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.HashSet;
import java.util.Set;

@CrossOrigin( origins   =   "*" ,   maxAge   =   3600 )
@RestController
@RequestMapping( "/api/auth" )
public class AuthRestAPIs {

    AuthenticationManager authenticationManager;

    @Autowired
    UserRepository userRepository ;

    @Autowired
    RoleRepository roleRepository ;

    @Autowired
    PasswordEncoder encoder ;

    @Autowired
    JwtProvider jwtProvider ;

    @PostMapping("/signin")
    public ResponseEntity<?> authenticateUser(@Valid @RequestBody LoginForm loginRequest) {

        Authentication authentication = authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        loginRequest.getUsername(),
                        loginRequest.getPassword()
                )
        );
        SecurityContextHolder.getContext().setAuthentication(authentication);
        String jwt = jwtProvider.generateJwtToken(authentication);
        return ResponseEntity.ok(new JwtResponse(jwt));
    }

    public ResponseEntity<String> registerUser (@Valid @RequestBody SignUpForm signUpRequest) {
        if (userRepository.existsByUsername(signUpRequest.getUsername())) {
            return new ResponseEntity<String>("FAIL->Username is already taken!", HttpStatus.BAD_REQUEST);
        }

        if (userRepository.existsByEmail(signUpRequest.getEmail())) {
            return new ResponseEntity<String>("FAIL->Email is already in use!", HttpStatus.BAD_REQUEST);
        }

        //creating user account
        User user = new User(signUpRequest.getName(), signUpRequest.getUsername(),
                signUpRequest.getEmail(), encoder.encode(signUpRequest.getPassword()));

        Set<String> strRoles = signUpRequest.getRole();
        Set<Role> roles = new HashSet<>();
        strRoles.forEach(role -> {
            switch (role) {
                case "admin":
                    Role adminRole = roleRepository.findByName(RoleName.ROLE_ADMIN)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(adminRole);

                    break;
                case "pm":
                    Role pmRole = roleRepository.findByName(RoleName.ROLE_PM)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(pmRole);

                    break;
                default:
                    Role userRole = roleRepository.findByName(RoleName.ROLE_USER)
                            .orElseThrow(() -> new RuntimeException("Fail! -> Cause: User Role not find."));
                    roles.add(userRole);
            }
        });
        user.setRoles(roles);
        userRepository.save(user);

        return ResponseEntity.ok().body("User registered successfully!");

    }
}
