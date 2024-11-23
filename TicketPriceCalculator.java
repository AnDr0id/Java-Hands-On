package com.JosephSumsion.handson2;
import java.util.Scanner;
public class TicketPriceCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.print("Are you a student? (true/false): ");
        boolean isStudent = scanner.nextBoolean();

        double price = 0;

        if (age < 0) {
            System.out.println("Invalid age");
        } else if (age >= 65) {
            price = 7.0;
        } else if (age <= 12 || isStudent) {
            price = 8.0;
        } else {
            price = 10.0;
        }

        System.out.println("Ticket price: $" + price);
        {
            scanner.close();
        }
    }
}