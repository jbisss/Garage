package com.example.controllers;

import com.example.classes.Car;
import com.example.classes.ObjectsStorage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import java.util.ArrayList;

public class CarsListController {
    public Button buttonHonda;
    public Button buttonKia;
    public Button buttonFord;
    public Button buttonLada;
    public Button buttonChery;
    public TextField carBrand;
    public TextField carCost_1;
    public TextField carCost_2;
    public TextField carCost_3;
    public TextField carCost_4;
    public TextField carYear_1;
    public TextField carYear_2;
    public TextField carYear_3;
    public TextField carYear_4;
    public TextField carCondition_1;
    public TextField carCondition_2;
    public TextField carCondition_3;
    public TextField carCondition_4;
    public TextField sallerName_1;
    public TextField sallerName_2;
    public TextField sallerName_3;
    public TextField sallerName_4;
    public TextField sallerAge_1;
    public TextField sallerAge_2;
    public TextField sallerAge_3;
    public TextField sallerAge_4;
    public TextField sallerRating_1;
    public TextField sallerRating_2;
    public TextField sallerRating_3;
    public TextField sallerRating_4;
    public TextField customerName;
    public TextField customerMoney;
    public TextField customerAge;
    public Button buttonCarChoose_1;
    public Button buttonCarChoose_2;
    public Button buttonCarChoose_3;
    public Button buttonCarChoose_4;
    public TextField textYearChosenCar;
    public TextField textConditionChosenCar;
    public TextField textCostChosenCar;
    public TextField textChosenCar;
    public Button buttonBuy;
    public Button buttonGarage;
    public Label approveCard;
    public Label approveCar;
    public TextField textPin;
    public ArrayList<TextField> textCost = new ArrayList<>();
    public ArrayList<TextField> textYear = new ArrayList<>();
    public ArrayList<TextField> textCondition = new ArrayList<>();
    public ArrayList<TextField> textSalesmanName = new ArrayList<>();
    public ArrayList<TextField> textSalesmanAge = new ArrayList<>();
    public ArrayList<TextField> textSalesmanRating = new ArrayList<>();
    public ArrayList<Button> buttonsChoice = new ArrayList<>();

    public void initialize(){
        buttonBuy.setDisable(true);
        buttonCarChoose_1.setDisable(true);
        buttonCarChoose_2.setDisable(true);
        buttonCarChoose_3.setDisable(true);
        buttonCarChoose_4.setDisable(true);
        buttonsChoice.add(buttonCarChoose_1);
        buttonsChoice.add(buttonCarChoose_2);
        buttonsChoice.add(buttonCarChoose_3);
        buttonsChoice.add(buttonCarChoose_4);
        chosenCar = null;
        chosenCars = null;
        customerName.setText(ObjectsStorage.customer.getFullName());
        customerMoney.setText(Integer.toString(ObjectsStorage.customer.getMoney()));
        customerAge.setText(Integer.toString(ObjectsStorage.customer.getAge()));
        textCost.add(this.carCost_1);
        textCost.add(this.carCost_2);
        textCost.add(this.carCost_3);
        textCost.add(this.carCost_4);
        textYear.add(this.carYear_1);
        textYear.add(this.carYear_2);
        textYear.add(this.carYear_3);
        textYear.add(this.carYear_4);
        textCondition.add(this.carCondition_1);
        textCondition.add(this.carCondition_2);
        textCondition.add(this.carCondition_3);
        textCondition.add(this.carCondition_4);
        textSalesmanName.add(this.sallerName_1);
        textSalesmanName.add(this.sallerName_2);
        textSalesmanName.add(this.sallerName_3);
        textSalesmanName.add(this.sallerName_4);
        textSalesmanAge.add(this.sallerAge_1);
        textSalesmanAge.add(this.sallerAge_2);
        textSalesmanAge.add(this.sallerAge_3);
        textSalesmanAge.add(this.sallerAge_4);
        textSalesmanRating.add(this.sallerRating_1);
        textSalesmanRating.add(this.sallerRating_2);
        textSalesmanRating.add(this.sallerRating_3);
        textSalesmanRating.add(this.sallerRating_4);
    }
    private static Car chosenCar = null;
    private static ArrayList<Car> chosenCars = null;
    public void buyCar(){
        if (ObjectsStorage.customer.getPin() == Integer.parseInt(textPin.getText())){
            System.out.println("Correct pin!");
            if (ObjectsStorage.customer.getMoney() >= Integer.parseInt(chosenCar.getCost())) {
                System.out.println("Enough money!");
                ObjectsStorage.customer.changeMoneyOnCard(Integer.parseInt(chosenCar.getCost()));
                ObjectsStorage.garage.addCar(chosenCar);
                chosenCars.remove(chosenCar);
                setCarsOnFields(chosenCars);
                customerMoney.setText(Integer.toString(ObjectsStorage.customer.getMoney()));
                textPin.setText("");
                textChosenCar.setText("");
                textConditionChosenCar.setText("");
                textYearChosenCar.setText("");
                textCostChosenCar.setText("");
                buttonBuy.setDisable(true);
                chosenCar = null;
                chosenCars = null;
            }
        }
    }
    public void moveToGarage(){
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("garage.fxml"));
        LoaderFxml(loader);
        Stage stagePrev = (Stage) buttonGarage.getScene().getWindow();
        stagePrev.hide();
    }
    public void LoaderFxml(FXMLLoader loader) {
        try {
            loader.load();
        } catch (Exception e) {
            e.printStackTrace();
        }
        Parent root = loader.getRoot();
        Stage stage = new Stage();
        stage.setScene(new Scene(root));
        stage.setTitle("Гараж");
        stage.show();
    }
    private void setCertainChosenCar(ArrayList<Car> cars, int index){
        chosenCar = cars.get(index);
        textChosenCar.setText(cars.get(index).getBrand());
        textCostChosenCar.setText(cars.get(index).getCost());
        textYearChosenCar.setText(cars.get(index).getYear());
        textConditionChosenCar.setText(cars.get(index).getCondition());
    }
    private void setChosenCar(int index){
        if (Car.getChosenIndex() == 0) {
            setCertainChosenCar(Car.carsHonda, index);
            chosenCars = Car.carsHonda;
        }
        if (Car.getChosenIndex() == 1) {
            setCertainChosenCar(Car.carsKia, index);
            chosenCars = Car.carsKia;
        }
        if (Car.getChosenIndex() == 2) {
            setCertainChosenCar(Car.carsFord, index);
            chosenCars = Car.carsFord;
        }
        if (Car.getChosenIndex() == 3) {
            setCertainChosenCar(Car.carsLada, index);
            chosenCars = Car.carsLada;
        }
        if (Car.getChosenIndex() == 4) {
            setCertainChosenCar(Car.carsChery, index);
            chosenCars = Car.carsChery;
        }
    }
    public void buttonChoseClick_1(){
        buttonBuy.setDisable(false);
        setChosenCar(0);
    }
    public void buttonChoseClick_2(){
        buttonBuy.setDisable(false);
        setChosenCar(1);
    }
    public void buttonChoseClick_3(){
        buttonBuy.setDisable(false);
        setChosenCar(2);
    }
    public void buttonChoseClick_4(){
        buttonBuy.setDisable(false);
        setChosenCar(3);
    }
    public void setCarBrand(String carBrand){
        this.carBrand.setText(carBrand);
    }
    private void clearCarsOnFields(){
        for (int i = 0; i < textCost.size(); i++){
            textCost.get(i).setText("");
            textYear.get(i).setText("");
            textCondition.get(i).setText("");
            textSalesmanName.get(i).setText("");
            textSalesmanAge.get(i).setText("");
            textSalesmanRating.get(i).setText("");
            buttonsChoice.get(i).setDisable(true);
        }
    }
    private void setCarsOnFields(ArrayList<Car> cars){
        clearCarsOnFields();
        for (int i = 0; i < cars.size(); i++){
            textCost.get(i).setText(cars.get(i).getCost());
            textYear.get(i).setText(cars.get(i).getYear());
            textCondition.get(i).setText(cars.get(i).getCondition());
            textSalesmanName.get(i).setText(cars.get(i).getSalesmanName());
            textSalesmanAge.get(i).setText(cars.get(i).getSalesmanAge());
            textSalesmanRating.get(i).setText(cars.get(i).getSalesmanRating());
            buttonsChoice.get(i).setDisable(false);
        }
    }
    // Button
    public void buttonHondaClick(){
        setCarBrand("Honda");
        Car.setChosenIndex(0);
        setCarsOnFields(Car.carsHonda);
    }
    public void buttonKiaClick(){
        setCarBrand("Kia");
        Car.setChosenIndex(1);
        setCarsOnFields(Car.carsKia);
    }
    public void buttonFordClick(){
        setCarBrand("Ford");
        Car.setChosenIndex(2);
        setCarsOnFields(Car.carsFord);
    }
    public void buttonLadaClick(){
        setCarBrand("Lada");
        Car.setChosenIndex(3);
        setCarsOnFields(Car.carsLada);
    }
    public void buttonCheryClick(){
        setCarBrand("Chery");
        Car.setChosenIndex(4);
        setCarsOnFields(Car.carsChery);
    }
}
