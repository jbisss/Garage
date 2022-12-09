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
    public  static Garage garage;
}
