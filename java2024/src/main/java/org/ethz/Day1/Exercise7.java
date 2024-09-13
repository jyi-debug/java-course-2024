package org.ethz.Day1;

import java.util.Random;
import java.util.Scanner;


public class Exercise7 {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Input the secret number between 0 and 1000:");
            int secretNumber = input.nextInt();
            if (secretNumber < 0 || secretNumber > 1000)
            System.out.println("The number is not in the correct range!");
            else {
                int numberOfGuesses = 0;
                Random r = new Random();
                boolean guessed = false;
                while (!guessed) {
                    int newGuess = r.nextInt(1001);
                    numberOfGuesses++;
                    if (newGuess == secretNumber) {
                        System.out.println("You have guessed the secret number!");
                        System.out.println("The secret number was: " + newGuess);
                        System.out.println("The program needed " + numberOfGuesses + " tries to guess the number");
                        guessed = true;
                    }
                }
            }
            input.close();
        }
    }
                

