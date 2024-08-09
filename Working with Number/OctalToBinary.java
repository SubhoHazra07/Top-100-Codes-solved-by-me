// Convert a Octal to Number to its Equivalent Binary Number 

import java.lang.*;
import java.util.*;
public class OctalToBinary {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Octal Number : ");
        int octal=scanner.nextInt();
        int result=octalToBinary(octal);
        if(result==-1){
            System.out.println("You Entered a Invalid Octal Number !");
        }else{
            System.out.println(octal+" its equvalent Binary Number is : "+result);
        }
        scanner.close();
    }
    public static int octalToBinary(int octal){
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
        return decimalToBinary(decimal);
    }
    
    // we can made this function by using ArrayList also
    public static int decimalToBinary(int decimal){
        int binary=0;
        int index=0;
        while(decimal>0){
            int rem=decimal%2;
            binary+=rem*Math.pow(10,index);
            decimal/=2;
            index++;
        }
        return binary;
    }
}

/*
Output :
Enter a Octal Number : 347
347 its equvalent Binary Number is : 11100111
 */