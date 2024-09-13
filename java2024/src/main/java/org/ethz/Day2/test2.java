package org.ethz.Day2;

public class test2 {
    // public static void main(String[] args) {
    //     printArray(new int[] {1, 2, 3, 3});
    // }

    // public static void printArray(int[] array) {
    //     for (int i = 0; i < array.length; i++) {
    //         System.out.println(array[i] + " ");
    //     }
    // }

    public static void main(String[] args) {
        printMax(34, 3, 3, 2, 56.5);  // Pass multiple arguments
        printMax(new double[]{1, 2, 3});  // Pass an array
    }
    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("No argument passed");
            return;
        }
        
        double result = numbers[0];
        
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > result) {
                result = numbers[i];
            }
        }
        
        System.out.println("The max value is " + result);
    }
        
}

