package com.company;

import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        int switchValue = 5;

        switch (switchValue) {
            case 1:
                System.out.println("Value of 1");
                break;
            case 2:
                System.out.println("value of 2");
                break;
            case 3:
                System.out.println("value of 3");
                break;
            case 4:
            case 5:
            case 6:
                System.out.println("was a 4, or a 5, or a 6");
            default:
                System.out.println("was not any of these values");
                break;
        }
        String month = "january";

        switch (month.toUpperCase()) {
            case "JANUARY":
                System.out.println("jan");
                break;
            case "June":
                System.out.println("june");
                break;
            case "DECEMBER":
                System.out.println("dec");
                break;
            default:
                System.out.println("Month not defined");
        }

    }
}
