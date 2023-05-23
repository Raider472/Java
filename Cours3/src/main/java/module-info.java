module com.example.cours3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cours3 to javafx.fxml;
    exports com.example.cours3;
}