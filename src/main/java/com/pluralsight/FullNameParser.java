package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        // names new scanner
        Scanner input = new Scanner(System.in);

        // prompts user for full name
        System.out.println("Please enter your full first, middle, and last name: ");
        String fullName = input.nextLine();

        // calls method fullNameParser to separate the names
        String[] parsedNames = fullNameParser(fullName);

        // names each part of the outputted string list
        String first = parsedNames[0];
        String middle = parsedNames[1];
        String last = parsedNames[2];

        // prints names out as formatted in assignment
        System.out.printf("""
                        First name: %s
                        Middle name: %s
                        Last name: %s
                        """,
                first, middle, last);

    }

    // method fullNameParser
    public static String[] fullNameParser(String fullName) {

        // trims fullName, then separates them with split()
        fullName = fullName.trim();
        String[] separatedNames = fullName.split(" ");

        // creates empty strings
        String first = "";
        String middle = "";
        String last = "";

        // assigns split names to empty strings depending on how many there are
        switch (separatedNames.length) {
            case 1:
                first = separatedNames[0];
                middle = "(none)";
                last = "(none)";
                break;
            case 2:
                first = separatedNames[0];
                middle = "(none)";
                last = separatedNames[1];
                break;
            case 3:
                first = separatedNames[0];
                middle = separatedNames[1];
                last = separatedNames[2];
                break;
            default:
                System.out.println("You have not entered anything meaningful. Please restart.");
        }

        // cleans up the names, capitalizing first letters and lowercasing others
        first = first.toUpperCase().charAt(0) + first.substring(1);
        middle = middle.toUpperCase().charAt(0) + middle.substring(1);
        ;
        last = last.toUpperCase().charAt(0) + last.substring(1);

        // returns new list of parsed names
        return new String[]{first, middle, last};

    }

}
