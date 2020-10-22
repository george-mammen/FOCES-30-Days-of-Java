/* Day 3
Write a Java program to get a number from the user and print whether it is positive or negative and do the following task 
Task 1 : if number is positive then check if the number is divisible by 5. 
Task 2: if number is not positive then print number is negative */

import java.io.*;
import java.util.*;

public class DayThree{

    public static void main(String[] args) {
        int n;
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        scan.close();
        if (n <= 100 && n >= -100) {
            if (n >= 0) {
                if (n % 5 == 0) {
                    System.out.println("divisible by 5");
                }
            } else if (n < 0) {
                System.out.println("negative");
            }
        }
    }
}
