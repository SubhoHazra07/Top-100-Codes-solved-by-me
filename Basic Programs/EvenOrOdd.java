// Check whether the Number is Even or Odd

import java.lang.*;
import java.util.*;
public class EvenOrOdd {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(num%2==0){
            System.out.println(num+" is an Even Number");
        }else{
            System.out.println(num+" is an Odd Number");
        }
        scanner.close();
    }
}
