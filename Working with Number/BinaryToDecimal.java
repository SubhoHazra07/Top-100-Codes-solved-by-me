// Convert a Binary Number to its Equivalent Decimal Number

import java.lang.*;
import java.util.*;
public class BinaryToDecimal {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        int num=scanner.nextInt();
        System.out.print(num+" to is Equivalent Decimal Number is : "+calculateDecimal(num));
        scanner.close();
    }
    public static int calculateDecimal(int num){
        int decimal=0;
        int index=0;
        while(num!=0){
            int rem=num%10;
            decimal+=rem*Math.pow(2,index);
            num/=10;
            index++;
        }
        return decimal;
    }
}

/*
Output :
Enter a Binary Number : 100110
100110 to is Equivalent Decimal Number is : 38
 */
