package com.example.classes;

import java.util.ArrayList;
import java.util.Random;

public class Salesman {
    public static ArrayList<Salesman> salesmen;
    private final int age;
    private final String fullName;
    private final double rating;
    static {
        Random rating = new Random();
        salesmen = new ArrayList<>();
        salesmen.add(new Salesman(55, "Зубенко Михаил Петрович",
                rating.nextDouble(5)));
        salesmen.add(new Salesman(32, "Горин Геннадий Орёлович",
                rating.nextDouble(5)));
        salesmen.add(new Salesman(19, "Иванов Иван Иванович",
                rating.nextDouble(5)));
        salesmen.add(new Salesman(57, "Кулешов Игорь Иванович",
                rating.nextDouble(5)));
        salesmen.add(new Salesman(44, "Котунин Альберт Владимирович",
                rating.nextDouble(5)));
    }
    public Salesman(int age, String fullName, double rating) {
        this.age = age;
        this.fullName = fullName;
        this.rating = rating;
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
