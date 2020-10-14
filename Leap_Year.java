/*Day 5: Leap Year
Task : 
An extra day is added to the calendar almost every four years as February 29, and the day is called a leap day. It corrects the calendar for the fact that our planet takes approximately 365.25 days to orbit the sun. A leap year contains a leap day.
In the Gregorian calendar, three conditions are used to identify leap years:
The year can be evenly divided by 4, is a leap year, unless:
The year can be evenly divided by 100, it is NOT a leap year, unless:
The year is also evenly divisible by 400. Then it is a leap year.
This means that in the Gregorian calendar, the years 2000 and 2400 are leap years, while 1800, 1900, 2100, 2200, 2300 and 2500 are NOT leap years.

Output :
The program must return a Boolean value (True/False). Output is handled by the provided code stub. */

import java.io.*;
import java.util.*;

public class Leap_Year {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        n = input.nextInt();
        if (n >= 1900 && n <= 100000) {
            if (((n % 4 == 0) && (n % 100 != 0)) || (n % 400 == 0))
                System.out.println("True");
            else
                System.out.println("False");
        }
    }
}
