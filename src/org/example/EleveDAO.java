package org.example;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EleveDAO {

    public List<Eleve> getEleves() {
        List<Eleve> eleves = new ArrayList<>();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "root");

            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * from televe");
            while(rs.next()) {
                eleves.add(new Eleve(rs.getString(1), rs.getString(2)));
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return eleves;
    }

    public void ajouterEleve(Eleve eleve) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "root");

            PreparedStatement statement = con.prepareStatement("INSERT INTO televe(nom, prenom) VALUES (?, ?);");
            statement.setString(1, eleve.getNom());
            statement.setString(2, eleve.getPrenom());

            statement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void supprimerEleve(Eleve eleve) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "root");

            PreparedStatement statement = con.prepareStatement("DELETE FROM televe where nom = ? AND prenom = ?");
            statement.setString(1, eleve.getNom());
            statement.setString(2, eleve.getPrenom());

            statement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void UpdateEleve(Eleve eleve1, Eleve eleve2) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ecole", "root", "root");

            PreparedStatement statement = con.prepareStatement("UPDATE televe SET nom = " + "\"" + eleve2.getNom() + "\"" + ", prenom = " + "\"" + eleve2.getPrenom() + "\"" + " where nom = ? AND prenom = ?");
            statement.setString(1, eleve1.getNom());
            statement.setString(2, eleve1.getPrenom());

            statement.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
