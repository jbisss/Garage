package com.example.classes;

public class Card {
    private final int pinCode;
    private int balance;
    public Card(int balance, int pinCode){
        this.balance = balance;
        this.pinCode = pinCode;
    }
    public int checkBalance(){
        return this.balance;
    }
    public int getPinCode(){
        return this.pinCode;
    }
    public void changeMoney(int money){
        this.balance -= money;
    }
}
