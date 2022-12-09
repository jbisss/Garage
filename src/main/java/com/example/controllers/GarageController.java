package com.example.controllers;

import com.example.classes.ObjectsStorage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.io.IOException;

public class GarageController {
    public TextArea textAreaGarage;
    public Button buttonBack;
    private void closeWindow(Button button){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("cars.fxml"));
        LoaderFxml(loader);
        Stage stagePrev = (Stage) button.getScene().getWindow();
        stagePrev.hide();
    }
    public void LoaderFxml(FXMLLoader loader) {
        try {
            loader.load();
        } catch (IOException e) {

            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Выбор машины ещё раз");
        stage.show();
    }
    public void buttonBackClick(){
        closeWindow(buttonBack);
    }
    public void initialize(){
        textAreaGarage.setText(String.valueOf(ObjectsStorage.garage));
    }
}
