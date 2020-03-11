package com.springLibraryApplication.Library.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "pages")
public class Page {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long Id;

    private String titrePage;

    private Integer numeroPage;

    private LocalDate dateCreation;

    @ManyToOne
    private Histoire histoire;

    public Page(){
    }

    public Page(String titrePage, Integer numeroPage, LocalDate dateCreation, Histoire histoire) {
        this.titrePage = titrePage;
        this.numeroPage = numeroPage;
        this.dateCreation = dateCreation;
        this.histoire = histoire;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getTitrePage() {
        return titrePage;
    }

    public void setTitrePage(String titrePage) {
        this.titrePage = titrePage;
    }

    public Integer getNumeroPage() {
        return numeroPage;
    }

    public void setNumeroPage(Integer numeroPage) {
        this.numeroPage = numeroPage;
    }

    public LocalDate getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(LocalDate dateCreation) {
        this.dateCreation = dateCreation;
    }

    public Histoire getHistoire() {
        return histoire;
    }

    public void setHistoire(Histoire histoire) {
        this.histoire = histoire;
    }
}
