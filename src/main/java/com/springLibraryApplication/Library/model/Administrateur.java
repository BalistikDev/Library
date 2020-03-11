package com.springLibraryApplication.Library.model;

import javax.persistence.Entity;

@Entity
public class Administrateur extends User{

    public Administrateur(String name, String username, String email, String password) {
        super(name, username, email, password);
    }
}
