package com.example.classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class ObjectsStorage {
    public static Customer customer;
    public  static Garage garage;
    public static void setCustomer(Customer customerSetup){
        customer = customerSetup;
        garage = new Garage(customer);
    }
}
