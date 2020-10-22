// Day - 12

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DayTwelve {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        int arr[]= new int[n];
        for(int i=0;i<n;i++){
            arr[i]=i;
        }
        System.out.println(Arrays.toString(arr));
    }
}
