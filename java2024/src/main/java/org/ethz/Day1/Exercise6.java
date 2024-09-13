package org.ethz.Day1;

import java.util.Scanner;

public class Exercise6 {
    // take the weights of package as an input
    // output the costs
    // weight provide meaningful message
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input the weight:"); 
        double w = input.nextDouble();
        if (w > 0 && w <= 3)
            System.out.println("The cost is:" + 1.5);
            else if ( w > 3 && w <= 5)
            System.out.println("the cost is:" + 2.5);
            else if ( w > 5 && w <= 10)
            System.out.println("The cost is:" + 4.2);
            else 
            System.out.println("The weight is out of accepted range!");
            input.close();


    }

    
}
