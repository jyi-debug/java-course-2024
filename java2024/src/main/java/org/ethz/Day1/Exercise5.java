package org.ethz.Day1;

import java.util.Scanner;

public class Exercise5 {
    /* a program that reads an interger from the console */
    /* multiplies all the digits in the interger */
    /* output the result */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input any number:");
        int number = input.nextInt();
        int result = 1;

        //try to convert the number to a positive value if the input is a negative number
        if (number < 1)
            number *= -1;
        do{
            //give the last current digits of number
             result *= number % 10;
             // then jump to the previous digits： e.g. from ones to tens
             number = number / 10;
        } while(number > 0);

        //output result
        System.out.println("The result is : " + result );
        input.close();
    }
}
