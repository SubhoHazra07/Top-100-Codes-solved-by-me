// Convert a Decimal Number to its Equivalent Binary Number 

import java.lang.*;
import java.util.*;
public class DecimalToBinary {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal=scanner.nextInt();
        System.out.println(decimal+" to its Equivalent Binary Number is : "+convertBinary(decimal));
        scanner.close();
    }
    public static int convertBinary(int decimal){
        String binary="";
        while(decimal>0){
            if(decimal%2==0){
                binary='0'+binary;
            }else{
                binary='1'+binary;
            }
            decimal/=2;
        }
        return Integer.parseInt(binary);
    }
}

/*
Output : 
Enter Decimal Number : 12
12 to its Equivalent Binary Number is : 1100
 */
