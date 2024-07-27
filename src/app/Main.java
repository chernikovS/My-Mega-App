package app;

import java.util.Scanner;

public class Main {

    static double tax;
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your salary: %s ", CURRENCY);
        double income = sc.nextDouble();

        double tax = taxCalculation(income);

        System.out.printf("Amount of tax: %s %.2f%n", CURRENCY, tax);
    }

    public static double taxCalculation(double income) {

        if(income <= 10000){
            tax = income * 0.025;
        } else if (income > 10000 && income <= 25000) {
            tax = income * 0.043;
        } else{
            tax = income * 0.067;
        }

        return tax;

    }
}