package com.example.controllers;

import com.example.classes.ObjectsStorage;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class ChooseSalesmenController {

    public TextField textFieldName_1;
    public TextField textFieldName_2;
    public TextField textFieldName_3;
    public TextField textFieldName_4;
    public TextField textFieldName_5;
    public TextField textFieldAge_1;
    public TextField textFieldAge_2;
    public TextField textFieldAge_3;
    public TextField textFieldAge_4;
    public TextField textFieldAge_5;
    public TextField textFieldRating_1;
    public TextField textFieldRating_2;
    public TextField textFieldRating_3;
    public TextField textFieldRating_4;
    public TextField textFieldRating_5;
    public Button button_1;
    public Button button_2;
    public Button button_3;
    public Button button_4;
    public Button button_5;

    public void LoaderFxml(FXMLLoader loader) {
        try {
            loader.load();
        } catch (IOException e) {

            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Выбор машины");
        stage.show();
    }
    private void closeWindow(Button button){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("cars.fxml"));
        LoaderFxml(loader);
        Stage stagePrev = (Stage) button.getScene().getWindow();
        stagePrev.hide();
    }
    @FXML
    public void buttonClick_1(){
        ObjectsStorage.setSalesmanNumber(0);
        closeWindow(button_1);
    }
    @FXML
    public void buttonClick_2(){
        ObjectsStorage.setSalesmanNumber(1);
        closeWindow(button_2);
    }
    @FXML
    public void buttonClick_3(){
        ObjectsStorage.setSalesmanNumber(2);
        closeWindow(button_3);
    }
    @FXML
    public void buttonClick_4(){
        ObjectsStorage.setSalesmanNumber(3);
        closeWindow(button_4);
    }
    @FXML
    public void buttonClick_5(){
        ObjectsStorage.setSalesmanNumber(4);
        closeWindow(button_5);
    }
    @FXML
    void initialize(){
        ArrayList<TextField> textFieldNameList = new ArrayList<>(Arrays.asList(textFieldName_1,
                textFieldName_2, textFieldName_3, textFieldName_4, textFieldName_5));
        ArrayList<TextField> textFieldAgeList = new ArrayList<>(Arrays.asList(textFieldAge_1,
                textFieldAge_2, textFieldAge_3, textFieldAge_4, textFieldAge_5));
        ArrayList<TextField> textFieldRatingList = new ArrayList<>(Arrays.asList(textFieldRating_1,
                textFieldRating_2, textFieldRating_3, textFieldRating_4, textFieldRating_5));
        for (int i = 0; i < 5; i++){
            textFieldNameList.get(i).setText(ObjectsStorage.salesmenList.get(i).getFullName());
            textFieldAgeList.get(i).setText(ObjectsStorage.salesmenList.get(i).getAge());
            textFieldRatingList.get(i).setText(ObjectsStorage.salesmenList.get(i).getRating());
        }
    }
}
