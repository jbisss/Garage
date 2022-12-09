package com.example.controllers;

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
import java.util.ArrayList;
import java.util.Arrays;

public class ChooseCarsController {
    public TextField brand_1;
    public TextField brand_2;
    public TextField brand_3;
    public TextField brand_4;
    public TextField cost_1;
    public TextField cost_2;
    public TextField cost_3;
    public TextField cost_4;
    public TextField year_1;
    public TextField year_2;
    public TextField year_3;
    public TextField year_4;
    public TextField condition_1;
    public TextField condition_2;
    public TextField condition_3;
    public TextField condition_4;
    public Button button_1;
    public Button button_2;
    public Button button_3;
    public Button button_4;
    public TextField textFieldCustomerName;
    public TextField textFieldCustomerAge;
    public TextField textFieldCustomerMoney;
    public TextField textFieldSalesmanName;
    public TextField textFieldSalesmanAge;
    public TextField textFieldSalesmanRating;
    public Button buttonApprovePin;
    public Label labelSuccess;
    public TextField textFieldPinCode;
    public Button buttonBack;
    public Button buttonToGarage;
    private int carCode;
    public void buttonToGarageClick(){
        closeWindow(buttonToGarage, "garage.fxml");
    }
    private void closeWindow(Button button, String file){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource(file));
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
        stage.setTitle("Выбор продавца ещё раз");
        stage.show();
    }
    public void buttonBackClick(){
        closeWindow(buttonBack, "sales.fxml");
    }
    public boolean checkMoneyOnCard(int carCost){
        return ObjectsStorage.getCustomer().getMoney() >= carCost;
    }
    public void buttonClick_1(){
        int carCost = Integer.parseInt(ObjectsStorage.listOfCarLists.get(ObjectsStorage.getSalesmanNumber()).
                get(0).getCost());
        if (checkMoneyOnCard(carCost)) {
            carCode = 0;
            ObjectsStorage.getCustomer().changeMoneyOnCard(carCost);
            labelSuccess.setText("Выбрана машина");
        } else {
            labelSuccess.setText("Мало денег");
        }
    }
    public void buttonClick_2(){
        int carCost = Integer.parseInt(ObjectsStorage.listOfCarLists.get(ObjectsStorage.getSalesmanNumber()).
                get(1).getCost());
        if (checkMoneyOnCard(carCost)) {
            carCode = 1;
            ObjectsStorage.getCustomer().changeMoneyOnCard(carCost);
            labelSuccess.setText("Выбрана машина");
        } else {
            labelSuccess.setText("Мало денег");
        }
    }
    public void buttonClick_3(){
        int carCost = Integer.parseInt(ObjectsStorage.listOfCarLists.get(ObjectsStorage.getSalesmanNumber()).
                get(2).getCost());
        if (checkMoneyOnCard(carCost)) {
            carCode = 2;
            ObjectsStorage.getCustomer().changeMoneyOnCard(carCost);
            labelSuccess.setText("Выбрана машина");
        } else {
            labelSuccess.setText("Мало денег");
        }
    }
    public void buttonClick_4(){
        int carCost = Integer.parseInt(ObjectsStorage.listOfCarLists.get(ObjectsStorage.getSalesmanNumber()).
                get(3).getCost());
        if (checkMoneyOnCard(carCost)) {
            carCode = 3;
            ObjectsStorage.getCustomer().changeMoneyOnCard(carCost);
            labelSuccess.setText("Выбрана машина");
        } else {
            labelSuccess.setText("Мало денег");
        }
    }
    public void buttonApprovePinClick(){
        if (labelSuccess.getText().equals("Выбрана машина")) {
            if (textFieldPinCode.getText().equals(Integer.toString(ObjectsStorage.getCustomer().getPin()))) {
                labelSuccess.setText("Машина куплена");
                textFieldCustomerMoney.setText(Integer.toString(ObjectsStorage.getCustomer().getMoney()));
                ObjectsStorage.garage.addCar(ObjectsStorage.listOfCarLists.
                        get(ObjectsStorage.getSalesmanNumber()).
                        get(carCode));
            }
        }
    }
    @FXML
    void initialize(){
        textFieldCustomerName.setText(ObjectsStorage.getCustomer().getFullName());
        textFieldCustomerAge.setText(Integer.toString(ObjectsStorage.getCustomer().getAge()));
        textFieldCustomerMoney.setText(Integer.toString(ObjectsStorage.getCustomer().getMoney()));
        int salesmanNumber = ObjectsStorage.getSalesmanNumber();
        textFieldSalesmanName.setText(ObjectsStorage.salesmenList.get(salesmanNumber).getFullName());
        textFieldSalesmanAge.setText(ObjectsStorage.salesmenList.get(salesmanNumber).getAge());
        textFieldSalesmanRating.setText(ObjectsStorage.salesmenList.get(salesmanNumber).getRating());
        ArrayList<TextField> brands =
                new ArrayList<>(Arrays.asList(brand_1, brand_2, brand_3, brand_4));
        ArrayList<TextField> costs =
                new ArrayList<>(Arrays.asList(cost_1, cost_2, cost_3, cost_4));
        ArrayList<TextField> years =
                new ArrayList<>(Arrays.asList(year_1, year_2, year_3, year_4));
        ArrayList<TextField> conditionals =
                new ArrayList<>(Arrays.asList(condition_1, condition_2, condition_3, condition_4));
        for(int i = 0; i < 4; i++){
            brands.get(i).setText(ObjectsStorage.salesmenList.get(ObjectsStorage.getSalesmanNumber()).
                    carsList.get(i).getBrand());
            costs.get(i).setText(ObjectsStorage.salesmenList.get(ObjectsStorage.getSalesmanNumber()).
                    carsList.get(i).getCost());
            years.get(i).setText(ObjectsStorage.salesmenList.get(ObjectsStorage.getSalesmanNumber()).
                    carsList.get(i).getYearOfIssue());
            conditionals.get(i).setText(ObjectsStorage.salesmenList.get(ObjectsStorage.getSalesmanNumber()).
                    carsList.get(i).getCondition());
        }
    }
}
