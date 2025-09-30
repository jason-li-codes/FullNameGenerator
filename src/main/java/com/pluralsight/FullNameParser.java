package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your full first, middle, and last name: ");
        String fullName = input.nextLine();

        String[] parsedNames = fullNameParser(fullName);

        String first = parsedNames[0];
        String middle = parsedNames[1];
        String last = parsedNames[2];

        System.out.printf("""
                        First name: %s
                        Middle name: %s
                        Last name: %s
                        """,
                first, middle, last);

    }

    public static String[] fullNameParser(String fullName) {

        fullName = fullName.trim();
        String[] separatedNames = fullName.split(" ");

        String first = "";
        String middle = "";
        String last = "";

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

        first = first.toUpperCase().charAt(0) + first.substring(1);
        middle = middle.toUpperCase().charAt(0) + middle.substring(1);
        ;
        last = last.toUpperCase().charAt(0) + last.substring(1);

        return new String[]{first, middle, last};

    }

}
