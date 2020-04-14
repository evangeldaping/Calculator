package com.example.java;

import java.util.Scanner;

import static com.example.java.util.MathMethods.*;

public class Calculator {

    public static void main(String[] args) {
        String String1 = getInput("Enter a numeric value: ");
        String String2 = getInput("Enter a numeric value: ");
        String op = getInput("Choose an operation (+ - * /):");

        double result;

        try {
            switch (op) {
                case "+":
                    result = addValues(String1, String2);
                    break;
                case "-":
                    result = subtractValues(String1, String2);
                    break;
                case "*":
                    result = multiplyValues(String1, String2);
                    break;
                case "/":
                    result = divideValues(String1, String2);
                    break;
                default:
                    System.out.println("Unrecognized operation!");
                    return;
            }

            System.out.println("The answer is " + result);

        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }

    private static String getInput(String prompt) {
        System.out.print(prompt);
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }

}
