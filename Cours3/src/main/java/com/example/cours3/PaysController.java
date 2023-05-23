package com.example.cours3;

import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;

public class PaysController implements Initializable {

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        CodeValue.setCellValueFactory(new PropertyValueFactory<Pays, String>("codeValue"));
        AlternateName.setCellValueFactory(new PropertyValueFactory<Pays, String>("alternateName"));
        CountryGroup.setCellValueFactory(new PropertyValueFactory<Pays, String>("countryGroup"));
        NameEn.setCellValueFactory(new PropertyValueFactory<Pays, String>("nameEn"));
        NameFr.setCellValueFactory(new PropertyValueFactory<Pays, String>("nameFr"));
        NameDe.setCellValueFactory(new PropertyValueFactory<Pays, String>("nameDe"));
        Lattitude.setCellValueFactory(new PropertyValueFactory<Pays, String>("lattitude"));
        Longittude.setCellValueFactory(new PropertyValueFactory<Pays, String>("longittude"));

        List<List<String>> csv = getCsv();
        for(int i = 1; i<csv.size(); i++) {
            Pays pays = new Pays(csv.get(i).get(0), csv.get(i).get(1), csv.get(i).get(2), csv.get(i).get(3), csv.get(i).get(4), csv.get(i).get(5), csv.get(i).get(6), csv.get(i).get(7));
            ObservableList<Pays> payss = Table.getItems();
            payss.add(pays);
            Table.setItems(payss);
        }
        /*ObservableList<Pays> payss = Table.getItems();
        payss.add(pays);
        Table.setItems(payss);*/
        System.out.print("das");
    }

    @FXML
    private TableView Table;
    @FXML
    private TableColumn CodeValue;

    @FXML
    private TableColumn AlternateName;

    @FXML
    private TableColumn CountryGroup;

    @FXML
    private TableColumn NameEn;

    @FXML
    private TableColumn NameFr;

    @FXML
    private TableColumn NameDe;

    @FXML
        private TableColumn Lattitude;

    @FXML
    private TableColumn Longittude;

    public List<List<String>> getCsv() {
        List<List<String>> records = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("pays.csv"))) {
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
}
