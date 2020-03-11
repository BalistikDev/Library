package com.springLibraryApplication.Library.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "histoires")
public class Histoire {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String titre;

    private LocalDate dateCreation;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "histoires_categories", joinColumns = @JoinColumn(name = "histoire_id"),
    inverseJoinColumns = @JoinColumn(name = "categorie_id"))
    private Set<Categorie> categories = new HashSet<>();

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL, mappedBy = "histoire")
    private Set<Page> pages = new HashSet<>();

    @ManyToOne
    private Auteur auteur;

    public Histoire(){
    }

    public Histoire(String titre, LocalDate dateCreation, Set<Categorie> categories, Auteur auteur) {
        this.titre = titre;
        this.dateCreation = dateCreation;
        this.categories = categories;
        this.auteur = auteur;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Set<Categorie> getCategories() {
        return categories;
    }

    public void setCategories(Set<Categorie> categories) {
        this.categories = categories;
    }

    public Set<Page> getPages() {
        return pages;
    }

    public void setPages(Set<Page> pages) {
        this.pages = pages;
    }

    public Auteur getAuteur() {
        return auteur;
    }

    public void setAuteur(Auteur auteur) {
        this.auteur = auteur;
    }
}
