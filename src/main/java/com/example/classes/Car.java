package com.example.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Car {
    public static ArrayList<Car> carsHonda;
    public static ArrayList<Car> carsKia;
    public static ArrayList<Car> carsFord;
    public static ArrayList<Car> carsLada;
    public static ArrayList<Car> carsChery;
    private final Salesman salesman;
    private final String brand;
    private final int cost;
    private final int year;
    private final double condition;
    static {
        Random condition = new Random();
        Random salesman = new Random();
        carsHonda = new ArrayList<>(Arrays.asList(
                new Car("Honda", 650000, 2009, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Honda", 750000, 2011, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Honda", 980000, 2007, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Honda", 700000, 2009, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size())))));
        carsKia = new ArrayList<>(Arrays.asList(
                new Car("Kia", 2000000, 2017, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Kia", 1800000, 2019, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Kia", 2250000, 2018, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Kia", 1990000, 2017, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size())))));
        carsFord = new ArrayList<>(Arrays.asList(
                new Car("Ford", 280000, 2001, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Ford", 250000, 2002, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Ford", 450000, 2007, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Ford", 360000, 2003, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size())))));
        carsLada = new ArrayList<>(Arrays.asList(
                new Car("Lada", 1600000, 2020, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Lada", 1540000, 2021, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Lada", 1200000, 2021, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Lada", 1550000, 2022, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size())))));
        carsChery = new ArrayList<>(Arrays.asList(
                new Car("Chery", 320000, 2005, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Chery", 250000, 2008, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Chery", 400000, 2007, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size()))),
                new Car("Chery", 360000, 2007, condition.nextDouble(5),
                        Salesman.salesmen.get(salesman.nextInt(Salesman.salesmen.size())))));
    }
    public Car(String brand, int cost, int yearOfIssue, double condition, Salesman salesman){
        this.brand = brand;
        this.cost = cost;
        this.year = yearOfIssue;
        this.condition = condition;
        this.salesman = salesman;
    }

    public String getBrand() {
        return brand;
    }

    public String getCost() {
        return Integer.toString(cost);
    }

    public String getYear() {
        return Integer.toString(year);
    }

    public String getCondition() {
        return String.format("%.1f", condition);
    }
    public String getSalesmanName(){
        return this.salesman.getFullName();
    }
    public String getSalesmanAge(){
        return this.salesman.getAge();
    }
    public String getSalesmanRating(){
        return this.salesman.getRating();
    }
    @Override
    public String toString(){
        return "\nМашина: " + this.brand + "\nСтоимость: " + this.cost + "руб." + "\nГод выпуска: "
                + this.year + "\nСостояние машины: " + String.format("%.1f", this.condition);
    }
}
