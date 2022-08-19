package com.cis;

/*
 *  Frank Bernal
 *  CIS-055 Data Structures
 *  CIS-059 Object Oriented Programming
 *  ChavviCalc  
 *  Start:      19 August 2022
 *  Finish: 
 */

// Start App
public class App {
    // Start main
    public static void main( String[] args ) {
        double a = 0.0;
        double b = 0.0;
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
        System.out.print("Please enter a selection: ");
    }   // End main
}   // End App
