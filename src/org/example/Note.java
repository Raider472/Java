package org.example;

public class Note {

    private Integer id;

    private String Matiere;

    private Integer valeur;

    private Integer idEleve;

    public Note(String matiere, Integer valeur, Integer idEleve) {
        this.Matiere = matiere;
        this.valeur = valeur;
        this.idEleve = idEleve;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMatiere() {
        return Matiere;
    }

    public void setMatiere(String matiere) {
        Matiere = matiere;
    }

    public Integer getValeur() {
        return valeur;
    }

    public void setValeur(Integer valeur) {
        this.valeur = valeur;
    }

    public Integer getIdEleve() {
        return idEleve;
    }

    public void setIdEleve(Integer idEleve) {
        this.idEleve = idEleve;
    }

    public enum Matiere {
        Maths, Anglais, Physique, Informatique;
    }
}
