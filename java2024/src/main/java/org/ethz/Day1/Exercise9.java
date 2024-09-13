package org.ethz.Day1;
import java.util.Scanner;
// nexted loop example
/*
 * step 1: input n-th perfect number, output the value of current number
 * step 2: 
 * step 3:
 * step 4:
 */
public class Exercise9 {
    public static void main(String[] args) {
           //=== solution to the assignment (a)===
        for (int i = 1; i < 100000; i++) {
            int sum = 0;
        
            for (int j = 1; j <= i / 2; j++) {
                if (i % j == 0)
                    sum += j;
            }
            if (sum == i)
                System.out.println(i + " is the perfect number.");
        }
        
        
        //===solution to the assignment (b)
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide an integer (N) to get Nth perfect number?");
        int n = input.nextInt();
        if (n < 1)
            System.out.println("N should be at least 1");
        else {
            int currentInteger = 0;
            int numberOfPerfectNumbersFound = 0;
            
            //=== we search for the number either until we have found enough
            //=== or when we reach the maximum integer that we can store.
            while (numberOfPerfectNumbersFound < n && currentInteger != Integer.MAX_VALUE) {
                int sum = 0;
                currentInteger++;
                
                for (int j = 1; j <= currentInteger / 2; j++) {
                    if (currentInteger % j == 0)
                        sum += j;
                }
                if (sum == currentInteger)
                    numberOfPerfectNumbersFound++;
            }
            
            if (numberOfPerfectNumbersFound == n)
                System.out.println(n + ". perfect number is " + currentInteger);
            else
                System.out.println("There is no " + n + ". perfect number");
            
            input.close();
        }

    }


}


