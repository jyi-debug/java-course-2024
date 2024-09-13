package org.ethz.Day2;

import java.util.Scanner;

public class Primenumber {
    	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		System.out.println(isPrime(number));
		input.close();
	}

	public static boolean isPrime(int n) {
		
		int i = 2;
		while (i <= n / 2) {
			
			if (n % i == 0)
				return false;
			i++;
		}
		return true;
	}
}

