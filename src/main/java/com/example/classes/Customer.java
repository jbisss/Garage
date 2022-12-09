package com.example.classes;

public class Customer {
    private final int age;
    private final String fullName;
    private final Card card;
    public Customer(int age, String fullName, int balance){
        this.age = age;
        this.fullName = fullName;
        this.card = new Card(balance, 1234);
    }

    public int getAge() {
        return age;
    }
    public int getPin(){
        return this.card.getPinCode();
    }

    public String getFullName() {
        return fullName;
    }
    public int getMoney(){
        return this.card.checkBalance();
    }
    public void changeMoneyOnCard(int money){
        this.card.changeMoney(money);
    }
}
