package com.cis;

/*
 *  Frank Bernal
 *  CIS-055 Data Structures
 *  CIS-059 Object Oriented Programming
 *  ChavviCalc  
 *  Start:      19 August 2022
 *  Finish: 
 */

 // Imports
 import java.util.Scanner;
 import java.util.InputMismatchException;

// Start App
public class App {
    // Start main
    public static void main( String[] args ) {
        // Local Variables
        double a = 0.0;         // Value for A
        double b = 0.0;         // Value for B
        boolean quit = false;   // Flag to end program
        // Create Scanner
        Scanner readInput = new Scanner(System.in);


        while (!quit) {
            // Local variables
            char menuOption = ' ';  // Value for menu option
            boolean isValid = false;   //Flag for valid options
            // Display the menu
            displayMenu(a, b);
            // Prompt for userSelection
            while (!isValid) {
                menuOption = getUserInput(readInput);
                // Check if valid selecion
                isValid = validInputCheck(menuOption);
            }
            
            // Pass to different operations
            switch (menuOption) {
                case 'a':   // Set A
                    a = setAorB(readInput, menuOption);
                    break;
                case 'q':
                    quit = true;
                    break;
            }
            // Add
            // Subtract
            // Divide
            // Multiply
            // Clear
        }   // End of while

        readInput.close();
    }   // End main

    // Print the menu
    private static void displayMenu(double a, double b) {
        // Print menu
        System.out.println("----------------------------------------");
        System.out.println("Chavvi Calc");
        System.out.println("----------------------------------------");
        System.out.printf("A = %.3f \tB = %.3f\n", a, b);
        System.out.println("----------------------------------------");
        System.out.printf("a\tEnter a value for A\n");
        System.out.printf("b\tEnter a value for B\n");
        System.out.printf("+\tAdd\n");
        System.out.printf("-\tSubtract\n");
        System.out.printf("/\tDivide\n");
        System.out.printf("*\tMultiply\n");
        System.out.printf("c\tClear\n");
        System.out.printf("q\tQuit\n");
        System.out.println("----------------------------------------");
    }   // End displayMenu

    // Get user input
    private static char getUserInput(Scanner readInput) {
        
        // Create local variables
        String userSelection = "";
        char input = ' ';
        // Prompt for user input
        System.out.print("Please enter a selection: ");

        // Read input from user
        userSelection = readInput.next();
        // Convert to lower
        userSelection = userSelection.toLowerCase();
        // Grab character
        input = userSelection.charAt(0);

        // Return char to main
        return input;
    }   // End getUserInput

    // Valid input check
    private static boolean validInputCheck(char a) {
        if (a != 'a' && a != 'b' && a != '+' && a != '-' && a != '/' && a != '*' && a != 'c' && a != 'q') {
            System.out.printf("\nInvalid selection, please try again.\n");
            return false;
        }
        else {
            return true;
        }
    }   // End of validInputCheck

    // Set A or B
    private static double setAorB(Scanner readInput, char menuOption) {
        // Create local variable
        boolean valid = false;
        double value = 0.0;

        while (!valid) {
            // Create local variable for loop
            value = 0.0;
            // Prompt for user input
            System.out.printf("Enter a value for %c: ", menuOption);
            // Store input to value
            try {
                value = readInput.nextDouble();
            }   // End of try
            catch (InputMismatchException e) {
                System.out.println("Value must be numeric, please try again");
                readInput.nextLine();
                continue;
            }   // End of catch

            // Set flag to true
            valid = true;
        }   // End of while

        return value;
    }   // End of setAorB
}   // End App
