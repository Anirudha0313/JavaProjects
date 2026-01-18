package CalculatorApp;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            System.out.println("\n Calculator App");
            System.out.println("1. Addition");
            System.out.println("2. Substraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.println("Enter your choice: ");

            int choice = input.nextInt();
            if (choice == 5) {
                System.out.println("Exiting");
                break;
            }
            System.out.println("Enter first number ");
            int a = input.nextInt();
            System.out.println("Enter second number ");
            int b = input.nextInt();
            if (choice == 1) {
                int c = a + b;
                System.out.println("Addition= " + c);


            } else if (choice == 2) {
                System.out.println("Substraction= " + (a - b));
            } else if (choice == 3) {
                System.out.println("Multiplication= " + (a * b));
            } else if (choice == 4) {
                if (b == 0) {
                    System.out.println("Error");

                }else {
                    System.out.println("Division= " + (a/b));
                }

            }
            else {
                System.out.println("Invalid choice");
            }
        }
    }
}