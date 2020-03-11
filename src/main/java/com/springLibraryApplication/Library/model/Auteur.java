package com.springLibraryApplication.Library.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "auteurs")
public class Auteur extends User{

    @Column(name = "prenoms")
    private String prenoms;

    @Lob
    @Column(name = "biographie")
    private String biographie;

    @Lob
    private  Byte[] photo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "auteur")
    private Set<Histoire> myStories = new HashSet<>();


    public Auteur(){}

    public Auteur(String name, String username, String email, String password) {
        super(name, username, email, password);
    }

    public String getPrenoms() {
        return prenoms;
    }

    public void setPrenoms(String prenoms) {
        this.prenoms = prenoms;
    }

    public Set<Histoire> getMyStories() {
        return myStories;
    }

    public void setMyStories(Set<Histoire> myStories) {
        this.myStories = myStories;
    }

    public Byte[] getPhoto() {
        return photo;
    }

    public void setPhoto(Byte[] photo) {
        this.photo = photo;
    }

    public String getBiographie() {
        return biographie;
    }

    public void setBiographie(String biographie) {
        this.biographie = biographie;
    }
}
