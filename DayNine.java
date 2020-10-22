// Day 9

import java.io.*;
import java.util.*;

public class DayNine {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String s=scan.nextLine();
        int len=s.length();
        int num=0;
        for(int i=len-1;i>=0;i--){
            if(s.charAt(i)=='1')
                num+=Math.pow(2,len-i-1);
        }
        System.out.println(num);
    }
}
