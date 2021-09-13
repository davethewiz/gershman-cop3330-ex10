/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Dave Gershman
 */

import java.util.Scanner;

public class App
{
    public static String GetInput(String request) {
        Scanner scanner = new Scanner(System.in);

        System.out.print(request);
        return scanner.nextLine();
    }

    public static int StringToInt(String str) {
        return Integer.parseInt(str);
    }

    public static float StringToFloat(String str) {
        return Float.parseFloat(str);
    }

    public static final float taxRate = 0.055f;

    public static void main( String[] args )
    {
        int itemCount = StringToInt(GetInput("Enter the number of items: "));

        float subtotal = 0;

        for (int i = 1; i <= itemCount; i++) {
            float price = StringToFloat(GetInput("Enter the price of item " + i + ": "));
            int quantity = StringToInt(GetInput("Enter the quantity of item " + i + ": "));

            subtotal += (price * quantity);
        }

        System.out.printf("Subtotal: $%.2f\n", subtotal);

        float tax = subtotal * taxRate;
        System.out.printf("Tax: $%.2f\n", tax);

        float total = subtotal + tax;
        System.out.printf("Total: $%.2f", total);
    }
}