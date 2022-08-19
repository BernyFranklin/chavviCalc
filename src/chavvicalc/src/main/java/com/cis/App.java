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


        while (!quit) {
            // Local variables
            char menuOption = ' ';  // Value for menu option
            // Display the menu
            displayMenu(a, b);
            // Prompt for userSelection
            menuOption = getUserInput();

            // Control Statement for menuOption
            // Quit
            if (menuOption == 'q') {
                quit = true;
            }   // End of quit
            else {
                continue;
            }
            
        }   // End of while

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
    private static char getUserInput() {
        // Create Scanner
        Scanner readInput = new Scanner(System.in);
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
        
        return input;
    }   // End getUserInput
}   // End App
