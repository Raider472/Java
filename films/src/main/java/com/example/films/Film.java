package com.example.films;

public class Film {
    private Integer rang;
    private String identifiant;
    private String nom;
    private Integer annee;

    private String acteurPrincip;

    public Film() {

    }

    public Integer getRang() {
        return rang;
    }

    public void setRang(int rang) {
        this.rang = rang;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Integer getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public String getActeurPrincip() {
        return acteurPrincip;
    }

    public void setActeurPrincip(String acteurPrincip) {
        this.acteurPrincip = acteurPrincip;
    }
}
