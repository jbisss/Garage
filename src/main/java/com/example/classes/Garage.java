package com.example.classes;

import java.util.ArrayList;

public class Garage {
    private final Customer owner;
    public ArrayList<Car> carList = new ArrayList<>();
    public Garage(Customer owner) {
        this.owner = owner;
    }
    public void addCar(Car car){
        carList.add(car);
    }
    @Override
    public String toString(){
        StringBuilder result = new StringBuilder("Повелитель гаража: " + this.owner.getFullName());
        for(Car car : carList) {
            result.append("\n");
            result.append(car);
        }
        return result.toString();
    }
}
