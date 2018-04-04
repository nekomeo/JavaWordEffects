package com.example;

import java.util.Scanner;

public class wordeffects {

    public static void main(String[] args) {

        boolean choice = true;
//        char playAgain;
        int selection = 1;


        while (choice) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Input a string: ");

            String inputChars = scanner.next();

            System.out.println("Enter a choice:\n1) UPPERCASE\n2) lowercase\n3) numberize\n4) Canadianize it\n" +
                    "5) Respond\n6) De-Space-It\n7) Character count");

            selection = scanner.nextInt();

            //        System.out.println(String.format("%s, your age is %d", inputChars, choice));
            switch (selection) {
                case 1:
                    System.out.println(inputChars + " Upper cased = " + inputChars.toUpperCase());
                    break;
                case 2:
                    System.out.println(inputChars + " lower cased = " + inputChars.toLowerCase());
                    break;
                case 3:
                    int numberized = Integer.parseInt(inputChars);
                    if (numberized == 0) {
                        System.out.println("Cannot convert to a number");
                    }
                    else {
                        System.out.println(inputChars + " as a string is converted to the integer " + numberized);
                    }
                    break;
                case 4:
                    System.out.println(inputChars + " Canadianized is " + inputChars + ", eh?");
                    break;
            }
        }
    }
}
