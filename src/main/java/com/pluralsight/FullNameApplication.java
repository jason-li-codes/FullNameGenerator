package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter parts of your name in the following prompts: ");
        System.out.println("First name: ");
        String first = input.nextLine();
        System.out.println("Middle name: ");
        String middle = input.nextLine();
        System.out.println("Last name: ");
        String last = input.nextLine();
        System.out.println("Suffix: ");
        String suffix = input.nextLine();

        String fullName = fullNameGenerator(first, middle, last, suffix);

        System.out.printf("Full name: %s", fullName);

    }

    public static String fullNameGenerator(string first, string middle, string last, string suffix) {





        return "";
    }

}
