/* Day 14
Task : Given a square matrix of dimension n x n, find the product of the sums of the elements along the two diagonals of the matrix. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayFourteen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int sump = 0, sums = 0;
        int arr[][] = new int[r][r];
        
        for(int i = 0; i < r; i++){
            for(int j = 0; j < r; j++){
                arr[i][j] = scan.nextInt();
           }
        }
        for(int i = 0; i < r; i++){
            sums += arr[i][r-i-1];
            sump += arr[i][i];
            }     
        
        System.out.println(sump * sums); 
}
}
