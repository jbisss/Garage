package com.example.classes;

import java.util.ArrayList;

public class Salesman {
    private final int age;
    private final String fullName;
    private final double rating;
    public final ArrayList<Car> carsList;
    public Salesman(int age, String fullName, double rating, ArrayList<Car> cars) {
        this.age = age;
        this.fullName = fullName;
        this.rating = rating;
        this.carsList = cars;
    }

    public String getAge() {
        return Integer.toString(this.age);
    }

    public String getFullName() {
        return fullName;
    }

    public String getRating() {
        return String.format("%.1f", this.rating);
    }
}
