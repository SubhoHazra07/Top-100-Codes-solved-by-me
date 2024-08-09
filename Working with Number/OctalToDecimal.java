// Convert a Octal Number to its Equivalent Decimal Number using BigInteger

import java.lang.*;
import java.util.*;
public class OctalToDecimal {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Octal Number : ");
        int octal=scanner.nextInt();
        if(convertDecimal(octal)==-1){
            System.out.println("It's is an Invalid Number");
        }else{
            System.out.println(octal+" to its Equivalent Decimal Number is : "+convertDecimal(octal));
        }
        scanner.close();
    }
    public static int convertDecimal(int octal){
        int decimal=0;
        int index=0;
        while(octal>0){
            int rem=octal%10;
            if(rem>=0&&rem<=7){
                decimal+=rem*Math.pow(8,index);
                octal/=10;
                index++;
            }else{
                return -1;
            }
        }
        return decimal;
    }
}

/*
Output :
Enter Octal Number : 5689
5689 to its Equivalent Decimal Number is : 3017
 */
