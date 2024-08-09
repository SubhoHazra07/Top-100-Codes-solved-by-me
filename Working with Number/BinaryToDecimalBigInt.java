// // Convert a Binary Number to its Equivalent Decimal Number using BigInteger

import java.lang.*;
import java.math.BigInteger;
import java.util.*;
public class BinaryToDecimalBigInt {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Binary Number : ");
        String binary=scanner.nextLine();
        BigInteger decimal=new BigInteger(binary,2);
        System.out.println(binary+" to its Equivalent Decimal Number is : "+decimal);
        scanner.close();
    }
}

/*
Output :
Enter Binary Number : 1000011110
1000011110 to its Equivalent Decimal Number is : 542
 */
