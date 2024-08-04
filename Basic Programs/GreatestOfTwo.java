// Find Greatest of Two Numbers

import java.lang.*;
import java.util.*;
public class GreatestOfTwo {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int b=scanner.nextInt();
        if(a>b){
            System.out.println(a+" is the Greatest Number");
        }else if(a<b){
            System.out.println(b+" is the Greatest Number");
        }else{
            System.out.println("Two Numbers are Equal");
        }
        scanner.close();
    }
}

/*
Output : 
Enter First Number : 65
Enter Second Number : 23
65 is the Greatest Number
 */