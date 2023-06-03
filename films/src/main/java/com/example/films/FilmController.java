package com.example.films;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class FilmController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        columnRang.setCellValueFactory(new PropertyValueFactory<Film, Integer>("rang"));
        columnIdentifiant.setCellValueFactory(new PropertyValueFactory<Film, String>("identifiant"));
        columnNom.setCellValueFactory(new PropertyValueFactory<Film, String>("nom"));
        columnAnnee.setCellValueFactory(new PropertyValueFactory<Film, Integer>("annee"));
        columnActeur.setCellValueFactory(new PropertyValueFactory<Film, Integer>("acteurPrincip"));

        this.ajouterFilmDansTab(123, "le Retour de Jean Valjean", "Hugo", 2012, "Victor Hugo");
    }

    @FXML
    private Button buttonAjouter;
    @FXML
    private Button buttonSuprimer;
    @FXML
    private Button buttonSuprimerSeul;
    @FXML
    private Button buttonAjouterCSV;

    @FXML
    private TableView tableFilm;

    @FXML
    private TableColumn columnRang;

    @FXML
    private TableColumn columnIdentifiant;

    @FXML
    private TableColumn columnNom;

    @FXML
    private TableColumn columnAnnee;

    @FXML
    private TableColumn columnActeur;

    @FXML
    private GridPane gridFilm;

    @FXML
    private TextField textRang;

    @FXML
    private TextField textIdentifiant;

    @FXML
    private TextField textNom;

    @FXML
    private TextField textAnnee;

    @FXML
    private TextField textActeur;

    public void ajouterFilmDansTab(Integer rang, String identifiant, String nom, Integer annee, String acteurPrincip) {
        Film filml = new Film();
        filml.setRang(rang);
        filml.setIdentifiant(identifiant);
        filml.setNom(nom);
        filml.setAnnee(annee);
        filml.setActeurPrincip(acteurPrincip);

        ObservableList<Film> films = tableFilm.getItems();
        films.add(filml);
        tableFilm.setItems(films);
    }

    @FXML
    private void ajouterFilm() {
        this.ajouterFilmDansTab(Integer.parseInt(this.textRang.getText()), this.textIdentifiant.getText(), this.textNom.getText(), Integer.parseInt(this.textAnnee.getText()), this.textActeur.getText());
    }

    @FXML
    private void supprimerTousFilms() {
        tableFilm.getItems().clear();
    }

    @FXML
    private void supprimerUnFilm() {
        Film selectedFilm = (Film) tableFilm.getSelectionModel().getSelectedItem();
        if (selectedFilm != null) {
            tableFilm.getItems().remove(selectedFilm);
        }
    }

    public List<List<String>> getCsv(String cheminFichier) {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(cheminFichier))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                records.add(Arrays.asList(values));
            }
            return records;
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void ajouterCSV() {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select CSV File");
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("CSV Files", "*.csv"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            String filePath = selectedFile.getAbsolutePath();
            ajouterCSVFunction(filePath);
        }
    }

    public void ajouterCSVFunction(String cheminFichier) {
        List<List<String>> csv = getCsv(cheminFichier);
        ObservableList<Film> films = tableFilm.getItems();

        for (int i = 1; i < csv.size(); i++) {
            Film film = new Film();
            film.setRang(Integer.parseInt(csv.get(i).get(0)));
            film.setIdentifiant(csv.get(i).get(1));
            film.setNom(csv.get(i).get(2));
            film.setAnnee(Integer.parseInt(csv.get(i).get(3)));
            film.setActeurPrincip(csv.get(i).get(4));
            films.add(film);
        }

        tableFilm.setItems(films);
    }
}