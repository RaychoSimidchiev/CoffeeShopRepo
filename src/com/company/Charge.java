package com.company;

import java.util.List;

public class Charge implements CreditCard{
    private String creditCard;
    private int amount;
    public Charge(String creditCard, int amount){
        this.creditCard = creditCard;
        this.amount = amount;
    }
    public void charge(List<Coffee> coffees){
        for (int i = 0; i < coffees.size(); i++) {
            System.out.println("Coffee -> " + String.format("%.2f", coffees.get(0).getPrice()) );
        }
        System.out.println("Credit Card \"" + creditCard + "\" was charged: " + String.format("%.2f", coffees.get(0).getPrice() * amount));
    }
}
