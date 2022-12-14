package com.cis;

/*
 *  Frank Bernal
 *  CIS-055 Data Structures
 *  CIS-059 Object Oriented Programming
 *  ChavviCalc  
 *  Start:      19 August 2022
 *  Finish:     20 August 2022
 */

 // Imports
 import java.util.Scanner;
 import java.util.InputMismatchException;

// Start App
public class App {
    // Start main
    public static void main( String[] args ) {
        // Local Variables
        float a = 0.0f;         // Value for A
        float b = 0.0f;         // Value for B
        boolean quit = false;   // Flag to end program
        // Create Scanner
        Scanner readInput = new Scanner(System.in);

        // Loop menu until 'q' selected
        while (!quit) {
            // Local variables
            char menuOption = ' ';  // Value for menu option
            boolean isValid = false;   //Flag for valid options

            // Display the menu
            displayMenu(a, b);

            // Prompt for userSelection
            // Loops until a valid char is selected
            while (!isValid) {
                // Prompts user for input and stores into menuOption
                menuOption = getUserInput(readInput);
                // Check if valid selecion and sets flag
                isValid = validInputCheck(menuOption);
            }   // End of while
            
            // Passes menuOption to different operations
            switch (menuOption) {
                case 'a':   // Set A
                    a = setAorB(readInput, menuOption);
                    break;
                case 'b':   // Set B
                    b = setAorB(readInput, menuOption);
                    break;
                case '+':   // Addition
                    executeMath(menuOption, a, b);
                    break;
                case '-':   // Subtraction
                    executeMath(menuOption, a, b);
                    break;
                case '/':   // Division
                    executeMath(menuOption, a, b);
                    break;
                case '*':   // Multiplication
                    executeMath(menuOption, a, b);
                    break;
                case 'c':   // Clear A and B
                    a = 0.0f;
                    b = 0.0f;
                    break;
                case 'q':
                    quit = true;
                    break;

            }   // End of switch
            
        }   // End of while

        // Close the Scanner object
        readInput.close();

    }   // End main

    /*
     *  displayMenu() is passed a and b to display the menu and current values 
     *  of a and b.
     */
    private static void displayMenu(float a, float b) {
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

    /*
     *  getUserInput() is passed the Scanner object to collect user input.
     *  this method returns a char
     */
    private static char getUserInput(Scanner readInput) {
        
        // Create local variables
        String userSelection = "";   // Used for initial input
        char input = ' ';            // Used for final return

        // Prompt for user input
        System.out.print("Please enter a selection: ");

        // Read input from user
        userSelection = readInput.next();
        // Convert to lower
        userSelection = userSelection.toLowerCase();
        // Grab character at index 0
        input = userSelection.charAt(0);
        // Return char to main
        return input;

    }   // End getUserInput

    /*
     *  validInputCheck() is passed a char from main and is compared to the valid list of characters
     *  this method returns a bool
     */
    private static boolean validInputCheck(char a) {
        // Local Variables
        char[] validChars = {'a', 'b', '+', '-', '/', '*', 'c', 'q'};
        // Iterate through validChars until we have a match
        for (int i = 0; i < validChars.length; i++) {
            // If found return true
            if (a == validChars[i]) {return true;}
        }

        // No match, prompt user and return false
        System.out.printf("\nInvalid selection, please try again.\n");
        return false;

    }   // End of validInputCheck

    // Set A or B
    private static float setAorB(Scanner readInput, char menuOption) {
        // Create local variable
        boolean valid = false;
        float value = 0.0f;

        while (!valid) {
            // Create local variable for loop
            value = 0.0f;
            // Prompt for user input
            System.out.printf("Enter a value for %c: ", menuOption);
            // Store input to value
            try {
                value = readInput.nextFloat();
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

    // Execute some math
    private static void executeMath(char menuOption, float a, float b) {
        // Local Variables
        float results = 0.0f;
        
        // Perform appropriate math for user selection
        switch (menuOption) {
            case '+':   // Add
                results = a + b;
                break;
            case '-':   // Subtract
                results = a - b;
                break;
            case '/':   // Divide
                if (a == 0.0f || b == 0.0f) {
                    break;
                }
                else {
                    results = a / b;
                }
                break;
            case '*':   // Multiply
                results = a * b;
        }   // End of switch
        
        // If trying to divide by zero do nothing, else display results
        if (menuOption == '/' && (a == 0.0f || b == 0.0f)) {
            System.out.printf("\n\nCannot divide by zero, please try another option\n\n");
        }
        else {
        // Print results
        displayResults(a, b, results, menuOption);
        }
    }   // End of executeMath

    // Display results
    private static void displayResults(float a, float b, float results, char menuOption) {
        System.out.printf("\n\n========================================\n\n");
        System.out.printf("Displaying Results: \n\n");
        System.out.printf("%.3f %c %.3f = %.3f\n", a, menuOption, b, results);
        System.out.printf("========================================\n\n");
    }   // End of displayResults

}   // End App
