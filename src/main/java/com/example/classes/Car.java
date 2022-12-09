package com.example.classes;

public class Car {
    private final String brand;
    private final int cost;
    private final int yearOfIssue;
    private final double condition;

    public String getBrand() {
        return brand;
    }

    public String getCost() {
        return Integer.toString(cost);
    }

    public String getYearOfIssue() {
        return Integer.toString(yearOfIssue);
    }

    public String getCondition() {
        return String.format("%.1f", condition);
    }

    public Car(String brand, int cost, int yearOfIssue, double condition){
        this.brand = brand;
        this.cost = cost;
        this.yearOfIssue = yearOfIssue;
        this.condition = condition;
    }
    @Override
    public String toString(){
        return "\nМашина: " + this.brand + "\nСтоимость: " + this.cost + "руб." + "\nГод выпуска: "
                + this.yearOfIssue + "\nСостояние машины: " + String.format("%.1f", this.condition);
    }
}
