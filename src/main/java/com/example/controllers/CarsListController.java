package com.example.controllers;

import com.example.classes.Car;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

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
    public ArrayList<TextField> textCost = new ArrayList<>();
    public ArrayList<TextField> textYear = new ArrayList<>();
    public ArrayList<TextField> textCondition = new ArrayList<>();

    public void initialize(){
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
    }

    public void setCarBrand(String carBrand){
        this.carBrand.setText(carBrand);
    }
    private void setCarsOnFields(ArrayList<Car> cars){
        for (int i = 0; i < cars.size(); i++){
            textCost.get(i).setText(cars.get(i).getCost());
            textYear.get(i).setText(cars.get(i).getYear());
            textCondition.get(i).setText(cars.get(i).getCondition());
        }
    }
    // Button
    public void buttonHondaClick(){
        setCarBrand("Honda");
        setCarsOnFields(Car.carsHonda);
    }
    public void buttonKiaClick(){
        setCarBrand("Kia");
        setCarsOnFields(Car.carsKia);
    }
    public void buttonFordClick(){
        setCarBrand("Ford");
        setCarsOnFields(Car.carsFord);
    }
    public void buttonLadaClick(){
        setCarBrand("Lada");
        setCarsOnFields(Car.carsLada);
    }
    public void buttonCheryClick(){
        setCarBrand("Chery");
        setCarsOnFields(Car.carsChery);
    }
}
