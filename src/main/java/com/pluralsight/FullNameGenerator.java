package com.pluralsight;

import java.util.Scanner;

public class FullNameGenerator {

    public static void main(String[] args) {

        // names scanner
        Scanner input = new Scanner(System.in);

        // prompts user for all parts of name separately, trimming as they are entered
        System.out.println("Please enter parts of your name in the following prompts: ");

        System.out.println("First name: ");
        String first = input.nextLine().trim();
        System.out.println("Middle name: ");
        String middle = input.nextLine().trim();
        System.out.println("Last name: ");
        String last = input.nextLine().trim();
        System.out.println("Suffix: ");
        String suffix = input.nextLine().trim();

        // calls method fullNameGenerator with all the inputs as arguments
        String fullName = fullNameGenerator(first, middle, last, suffix);

        // prints out the fullName
        System.out.printf("Full name: %s", fullName);

    }

    public static String fullNameGenerator(String first, String middle, String last, String suffix) {

        // for first and last names, capitalize the first and lowercase the other letters
        first = first.toUpperCase().charAt(0) + first.substring(1).toLowerCase();
        last = last.toUpperCase().charAt(0) + last.substring(1).toLowerCase();

        // create a string fullName made up of the first and last names
        String fullName = String.join(" ", first, last);

        // for middle names, capitalize the first letter and add a period only if it is not empty
        // then add it to fullName after the first name by finding the index of the space
        if (!middle.isEmpty()) {
            middle = middle.toUpperCase().charAt(0) + ".";
            fullName = fullName.substring(0, fullName.indexOf(" ")) + " " + middle +
                    fullName.substring(fullName.indexOf(" ") + 1);
        }

        // only add a suffix if it exists
        if (!suffix.isEmpty()) {
            fullName = fullName + ", " + suffix;
        }

        // return the fullName
        return fullName;
    }

}
