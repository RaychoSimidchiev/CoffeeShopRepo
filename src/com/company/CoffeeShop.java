package com.company;

import java.util.ArrayList;
import java.util.List;

public class CoffeeShop {
    public void buyCoffees(String cc, int numCoffees, double price) {

        List<Coffee> coffees = new ArrayList<>();

        for (int i = 0; i < numCoffees; i++) {
            coffees.add(new Coffee(price));
        }

        Charge chargeCoffees = new Charge(cc, coffees.size());
        chargeCoffees.charge(coffees);

    }
}
