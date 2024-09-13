package org.ethz.Day2;

public class Exercise4 {
    public static void main(String[] args) {

        int[] array = new int[2];

        String x = "Java";

        String y = "Java";

        String z = new String("Java");

        if (x == y){
            System.out.println("These string are the same");
        }
        else{
            System.out.println("These string are NOT the same");
        }

        if (y.equals(z)) {
            System.out.println("These strings are the same");
        } else {
            System.out.println("These strings are NOT the same");
        }
    }
}

