package org.ethz.Day1;

public class Exercise3 {
    /* find the mistakes in the following code and correct them( style, variable types,...) */
    /* This is the main method */
    public static void main(String[] args) {
        /** initial value of the counter */
        int x = 2; /* variable type error:2.0 change to 2*/
        double sum = 0.0;
        for (;x < 10; x++){
            sum += x;
        }/* braket missing */
            System.out.println("Sum is:" + sum);
        
    }

    public static void main(String[] args) {
        
    }
}
