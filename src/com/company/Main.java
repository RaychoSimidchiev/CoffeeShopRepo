package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        CoffeeShop coffeeShop = new CoffeeShop();

        System.out.println("Enter Credit Card :");
        String cc = sc.nextLine();

        System.out.println("Enter price for a coffee :");
        double price = Double.parseDouble(sc.nextLine());

        System.out.println("Enter amount :");
        int amount = Integer.parseInt(sc.nextLine());

        coffeeShop.buyCoffees(cc, amount, price);
    }
}
