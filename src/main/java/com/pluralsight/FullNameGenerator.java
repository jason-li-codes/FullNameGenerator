package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {

    public static void main(String[] args) {

        // names scanner
        Scanner input = new Scanner(System.in);

        // prompts user for all parts of name separately
        System.out.println("Please enter parts of your name in the following prompts: ");

        System.out.println("First name: ");
        String first = input.nextLine();
        System.out.println("Middle name: ");
        String middle = input.nextLine();
        System.out.println("Last name: ");
        String last = input.nextLine();
        System.out.println("Suffix: ");
        String suffix = input.nextLine();

        // calls method fullNameGenerator with all the inputs as arguments
        String fullName = fullNameGenerator(first, middle, last, suffix);

        // prints out the fullName
        System.out.printf("Full name: %s", fullName);

    }

    public static String fullNameGenerator(String first, String middle, String last, String suffix) {

        // first trim all the entered strings
        first = first.trim();
        middle = middle.trim();
        last = last.trim();
        suffix = suffix.trim();

        // for first and last names, capitalize the first and lowercase the other letters
        // for middle names, capitalize the first letter and add a period
        first = first.toUpperCase().charAt(0) + first.substring(1);
        middle = middle.toUpperCase().charAt(0) + ".";
        last = last.toUpperCase().charAt(0) + last.substring(1);

        // create a string fullName made up of the first, middle, and last names
        String fullName = String.join(" ", first, middle, last);

        // only add a suffix if it exists
        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        // return the fullName
        return fullName;
    }

}
