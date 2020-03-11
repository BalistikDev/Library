package com.springLibraryApplication.Library.model;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "categories")
public class Categorie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String label;

    private String description;

    @ManyToMany(mappedBy = "categories")
    private Set<Histoire> histoires = new HashSet<>();

    public Categorie(){
    }

    public Categorie(String label, String description){
        this.label = label;
        this.description = description;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Set<Histoire> getHistoires() {
        return histoires;
    }

    public void setHistoires(Set<Histoire> histoires) {
        this.histoires = histoires;
    }
}
