package org.ethz.Day1;

public class Exercise1 {
    
    public static void main(String[] args){
        int x = 2;
        for (; x <= 9; x++){
            System.out.println(x++);
        }

        int y = 2;
        for (; y < 10; y++){
            System.out.println(y++);
        }
    }
//we chould change the x < 10 to x <= 9
// problem we could encounter in the process: use; instead of :
// check the properties in file: pom.xml so that the jdk version matches the java version
// local variable can only be declare one time
}
