// Day 8
/* Read an array and print 0 and 1 for even and odd elements of array respectively*/

import java.io.*;
import java.util.*;

public class Explore_array {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int A[] = new int[n];
        for (int i=0; i<n; i++) {
            A[i] = scan.nextInt();
        }
        for (int i=0; i<n; i++) {
            if (A[i]%2 == 0) {
                System.out.print(0 + " OK ");
            } else {
                System.out.print(1 + " NOT OK ");
            }
        }
    }

}
