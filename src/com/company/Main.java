package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double meal_cost;
        System.out.println("Meal cost: ");
        meal_cost = in.nextDouble();
        in.nextLine();
        int tip_percent;
        System.out.println("Tip percent: ");
        tip_percent = in.nextInt();
        in.nextLine();
        int tax_percent;
        System.out.println("Tax percent: ");
        tax_percent = in.nextInt();
        in.nextLine();
        in.close();

        //Calculate the total tip percentage
        double tip = meal_cost * (tip_percent / 100.00);

        //Calculate the total tax percentage
        double tax = meal_cost * (tax_percent/100.00);

        double totalCost = meal_cost + tip + tax;
//        System.out.println(tip);
//        System.out.println(tax);
        System.out.print("The total meal cost is " + Math.round(totalCost) + " dollars.");
    }
}
