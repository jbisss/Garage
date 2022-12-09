module com.example.rrr {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.graphics;

    opens com.example.classes to javafx.fxml;
    exports com.example.classes;
    exports com.example.controllers;
    opens com.example.controllers to javafx.fxml;
}