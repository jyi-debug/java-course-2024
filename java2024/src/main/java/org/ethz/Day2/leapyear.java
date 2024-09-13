package org.ethz.Day2;

import java.util.Scanner;

public class leapyear {
    public static void main(String[] args) {

		System.out.println("Please input the year and first three letters of the month.");
		System.out.println("First letter of the month must be a capital letter.");
		
		Scanner input = new Scanner(System.in);
        int year = input.nextInt();
        String month = input.next();

        //test if a year is leapyear
        boolean isLeapYear = isLeapYear(year);
        //isLeapYear 变量将存储闰年判断的结果，即它是一个 true（表示闰年）或 false（表示不是闰年）。

        switch (month){
            case "Jan":
            case "Mar":
            case "Jul":
            case "Aug":
            case "Oct":
            case "Dec":	 System.out.println("Number of days is 31");
            break;
            case "Apr" :		
            case "Jun" :		
            case "Sep" :		
            case "Nov" : System.out.println("Number of days is 30"); 
		 			 break; 
            case "Feb" : if (isLeapYear)
                            System.out.println("Number of days is 29"); 
                        else
                            System.out.println("Number of days is 28");
                        break;		
      
      default : System.out.println("You did not input the correct month name."); 
      }
        }


        public static boolean isLeapYear(int year) {
            
            boolean isLeapYear = false;
            
            if (year % 4 == 0) {			
                if (year % 100 != 0 || year % 400 == 0)
                    isLeapYear = true;			
            }		
            return isLeapYear;
}
}
