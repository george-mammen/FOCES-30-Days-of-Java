import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        ArrayList[] arr= new ArrayList[20000];
        Scanner scan = new Scanner(System.in);
        int n=scan.nextInt();
        
        for(int i=0;i<n;i++){
            arr[i] = new ArrayList();
            int num = scan.nextInt();
            for(int j=0;j<num;j++){
                int item = scan.nextInt();
                arr[i].add(item);
                }
            }
            
        int query = scan.nextInt();
        for(int i=0;i<query;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            try{
                System.out.println(arr[a-1].get(b-1));
                }catch(Exception e){
                System.out.println("ERROR!");
                }
            }
        }
}
