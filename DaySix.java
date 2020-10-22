/*Day 6
Task : 
Given coefficients of a quadratic equation , you need to print the nature of the roots (real and distinct , real and equal , imaginary).

Output Format :
Output contains one/two lines.First line contains nature of the roots .The next line contains roots separated by a space if they exist. 
Use 'float' type to store the value of roots. */

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class DaySix{

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int root = (b * b) - 4 * (a * c);
        double roots = sqrt(root);
        if (root > 0) {
            System.out.println("Real and Distinct");
            System.out.println(((-b - (int) roots) / (2 * a)) + " " + ((-b + (int) roots) / (2 * a)));
        } else if (root < 0) {
            System.out.println("Imaginary");
        } else {
            System.out.println("Real and Equal");
            System.out.println(((-b + (int) roots) / (2 * a)) + " " + ((-b - (int) roots) / (2 * a)));
        }
    }

}
