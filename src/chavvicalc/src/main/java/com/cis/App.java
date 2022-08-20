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
            // A
            // B
            // Add
            // Subtract
            // Divide
            // Multiply
            // Clear
            // Control Statement for menuOption
            // Quit
            if (menuOption == 'q') {
                quit = true;
            }   // End of quit

        }   // End of while

        readInput.close();
    }   // End main

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
}   // End App
