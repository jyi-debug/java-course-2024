package org.ethz.Day1;

import java.util.Scanner;

public class Exercise4 {
    /* a program that computes the area and circumference of a circle with a given radius from the console */
    /* Declare the necessary constants */
    /* output the result */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input the radius of the circle:");
        
        double radius = input.nextDouble();
        // declare a constant
        final double PI = 3.14159;
        double area = radius * radius * PI;
        double circumference = 2 * radius * PI;

        // output the result
        System.out.println("The area is " + radius * radius * PI);
        System.out.println("The circumference is " + 2 * radius * PI);
        
        input.close();
        
    }
}
