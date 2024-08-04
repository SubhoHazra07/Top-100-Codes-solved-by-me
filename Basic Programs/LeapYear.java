// Find the Year is Leap Year or Not

import java.lang.*;
import java.util.*;
public class LeapYear {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Year : ");
        int year=scanner.nextInt();
        if((year%4==0 && year%100!=0) || year%400==0){
            System.out.println(year+" is a Leap Year");
        }else{
            System.out.println(year+" is not a Leap Year");
        }
        scanner.close();
    }
}

/*
Output : 
Enter a Year : 2024
2024 is a Leap Year
 */
