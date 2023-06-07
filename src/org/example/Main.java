package org.example;
import java.sql.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        afficherEleves();
        //new EleveDAO().supprimerEleve(new Eleve("Jean", "Valjean"));
        //new EleveDAO().ajouterEleve(new Eleve("Test", "Yepa"));
        //new EleveDAO().UpdateEleve(new Eleve("Test", "Yepa"), new Eleve("Jean", "Gaming"));
    }

    public static void afficherEleves() {
        List<Eleve> eleves = new EleveDAO().getEleves();
        eleves.stream().forEach(eleve -> System.out.println(eleve.getNom() + " " + eleve.getPrenom()));
    }
}