// Day 10

import java.util.Scanner;

public class DayTen{

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int n=scan.nextInt();
        int[] arr = new int[n];
        int flag=-1;
        
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
            }
        
        int a=scan.nextInt();
        
        for(int i=0;i<n;i++){
            for(int j = i + 1;j< n;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        
        for(int i=0;i<n;i++){
            if(arr[i]== a){
                flag=1;
                System.out.println(i);
            }}
            
        if(flag ==-1){
                System.out.println("-1");
            
            
            }
    }
}
        
