// Calculate Number of Days in a Month

import java.lang.*;
import java.util.*;
public class NumberOfDays {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Year : ");
        int year=scanner.nextInt();
        System.out.print("Enter Month : ");
        int month=scanner.nextInt();
        if(month==2 && (year%400==0 || (year%4==0 && year%100!=0))){
            System.out.println("Number of Days is : "+(numberOfDays(month-1)+1));
        }else{
            System.out.println("Number of Days is : "+numberOfDays(month-1));
        }
        scanner.close();
    }
    public static int numberOfDays(int num){
        int arr[]={31,28,31,30,31,30,31,31,30,31,30,31};
        return arr[num];
    }
}

/*
Output :
Enter Year : 2020
Enter Month : 2
Number of Days is : 29
Enter Year : 2003
Enter Month : 11
Number of Days is : 30
 */
