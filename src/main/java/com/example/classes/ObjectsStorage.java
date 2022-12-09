package com.example.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ObjectsStorage {
    private static Customer customer;
    public static void setCustomer(Customer customerSetup){
        customer = customerSetup;
        garage = new Garage(customer);
    }
    public static Customer getCustomer(){
        return customer;
    }
    public  static Garage garage;
    private static int salesmanNumber;
    public static void setSalesmanNumber(int salesmanNumberSetup){
        salesmanNumber = salesmanNumberSetup;
    }
    public static int getSalesmanNumber(){
        return salesmanNumber;
    }
    public static ArrayList<Salesman> salesmenList = new ArrayList<>();
    public static ArrayList<ArrayList<Car>> listOfCarLists = new ArrayList<>();
    static {
        Random condition = new Random();
        ArrayList<Car> cars_1 = new ArrayList<>(Arrays.asList(
                new Car("Honda", 650000, 2009, condition.nextDouble(5)),
                new Car("Lada", 1150000, 2021, condition.nextDouble(5)),
                new Car("Volvo", 1980000, 2015, condition.nextDouble(5)),
                new Car("Mazda", 40000, 1995, condition.nextDouble(5))));
        ArrayList<Car> cars_2 = new ArrayList<>(Arrays.asList(
                new Car("Mini", 2000000, 2015, condition.nextDouble(5)),
                new Car("Nissan", 1000000, 2015, condition.nextDouble(5)),
                new Car("Hyundai", 3750000, 2021, condition.nextDouble(5)),
                new Car("Mercedes", 1990000, 2019, condition.nextDouble(5))));
        ArrayList<Car> cars_3 = new ArrayList<>(Arrays.asList(
                new Car("Ford", 180000, 2001, condition.nextDouble(5)),
                new Car("Audi", 50000, 2022, condition.nextDouble(5)),
                new Car("Volkswagen", 4750000, 2019, condition.nextDouble(5)),
                new Car("Kia", 700000, 1999, condition.nextDouble(5))));
        ArrayList<Car> cars_4 = new ArrayList<>(Arrays.asList(
                new Car("Ferrari", 2000000, 2014, condition.nextDouble(5)),
                new Car("Opel", 190000, 2010, condition.nextDouble(5)),
                new Car("Porsche", 150000, 2009, condition.nextDouble(5)),
                new Car("Lexus", 3200000, 2008, condition.nextDouble(5))));
        ArrayList<Car> cars_5 = new ArrayList<>(Arrays.asList(
                new Car("BMW", 120000, 2005, condition.nextDouble(5)),
                new Car("Renault", 250000, 2008, condition.nextDouble(5)),
                new Car("Aston Martin", 1600000, 2019, condition.nextDouble(5)),
                new Car("Peugeot", 800000, 2017, condition.nextDouble(5))));
        listOfCarLists.add(cars_1);
        listOfCarLists.add(cars_2);
        listOfCarLists.add(cars_3);
        listOfCarLists.add(cars_4);
        listOfCarLists.add(cars_5);
        Random rating = new Random();
        salesmenList.add(new Salesman(55, "Зубенко Михаил Петрович",
                rating.nextDouble(5), cars_1));
        salesmenList.add(new Salesman(32, "Горин Геннадий Орёлович",
                rating.nextDouble(5), cars_2));
        salesmenList.add(new Salesman(19, "Иванов Иван Иванович",
                rating.nextDouble(5), cars_3));
        salesmenList.add(new Salesman(57, "Кулешов Игорь Иванович",
                rating.nextDouble(5), cars_4));
        salesmenList.add(new Salesman(44, "Котунин Альберт Владимирович",
                rating.nextDouble(5), cars_5));
    }
}
