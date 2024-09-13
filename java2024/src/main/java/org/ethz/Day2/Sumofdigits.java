package org.ethz.Day2;

import java.util.Scanner;

public class Sumofdigits {
    public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		long number = input.nextLong();
        if (number < 0)
            number *= -1;

        else
			    System.out.println("Sum of all digits of the number " + 
				number + " is: " + sumDigits(number));
                // input.next();  // 清空无效输入
        input.close();
    }
   

        public static int sumDigits(long n){
            int sum = 0;
            while(n > 0){
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }

	
}

