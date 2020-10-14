/* Day 4
Task : Create a mini calculator with the operation addition , subtraction ,multiplication and division Input a Variable n for choosing any of the 4 operations. 
       Then choose any of the 4 operation and perform the task. Then input 2 variables to perform the operation. Also check if the number can perform the task. */

import java.io.*;
import java.util.*;

public class Switch {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int sum, diff, mul, div;
        if (n <= 100 && n >= -100) {
            switch (n) {
                case 1:
                    System.out.println(a+b);
                    break;
                case 2:
                    System.out.println(a-b);
                    break;
                case 3:
                    System.out.println(a*b);
                    break;
                case 4:
                    if (b == 0) {
                        System.out.println("Error");
                    } else {
                        System.out.println(a/b);
                    }
                    break;
                default:
                    System.out.println("Option not found");
            }
        }
    }
}
