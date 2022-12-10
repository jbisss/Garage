package com.example.controllers;

import com.example.classes.Customer;
import com.example.classes.ObjectsStorage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class RegisterController {
    public Label ageTest;
    @FXML
    private TextField textName;
    @FXML
    private TextField textAge;
    @FXML
    private TextField textBalance;
    @FXML
    private Button approveButton;

    public void LoaderFxml(FXMLLoader loader) {
        try {
            loader.load();
        } catch (IOException e) {

            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Выбор продавца");
        stage.show();
    }

    @FXML
    protected void createCustomer() {
        int age = 0;
        int balance = 0;
        try {
            age = Integer.parseInt(textAge.getText());
            balance = Integer.parseInt(textBalance.getText());
            if (age >= 18) {
                ObjectsStorage.setCustomer(new Customer(age, textName.getText(), balance));
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(getClass().getResource("carsList.fxml"));
                LoaderFxml(loader);
                Stage stagePrev = (Stage) approveButton.getScene().getWindow();
                stagePrev.hide();
            }
            else {
                Stage stagePrev = (Stage) approveButton.getScene().getWindow();
                stagePrev.hide();
            }
        } catch (Exception exception) {
            System.out.println("Invalid input!");
        }
    }

}