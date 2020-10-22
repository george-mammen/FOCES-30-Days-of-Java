/* Day 13
Task : Given a matrix of dimension m x n, find the transpose of that matrix. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayThirteen {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int r = scan.nextInt();
        int c = scan.nextInt();
        int arr[][] = new int[r][c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i = 0; i < c; i++){
            for(int j = 0; j < r; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println(" ");
        }
               
      
    }
}
