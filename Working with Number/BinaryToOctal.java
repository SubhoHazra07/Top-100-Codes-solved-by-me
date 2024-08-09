// Convert a Binary Number to its Equivalent Octal Number 

import java.lang.*;
import java.util.*;
public class BinaryToOctal {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Binary Number : ");
        int binary=scanner.nextInt();
        System.out.println(binary+" to its Equivalent Octal Number : "+binaryToOctal(binary));
        scanner.close();
    }
    public static int binaryToOctal(int binary){
        int decimal=0;
        int index=0;
        while(binary>0){
            int rem=binary%10;
            decimal+=(rem*Math.pow(2,index));
            binary/=10;
            index++;
        }
        return decimalToOctal(decimal);
    }
    public static int decimalToOctal(int decimal){
        int octal=0;
        int index=0;
        while(decimal>0){
            int rem=decimal%8;
            octal+=rem*Math.pow(10,index);
            decimal/=8;
            index++;
        }
        return octal;
    }
}

/*
Output :
Enter a Binary Number : 010101011
10101011 to its Equivalent Octal Number : 253
 */
