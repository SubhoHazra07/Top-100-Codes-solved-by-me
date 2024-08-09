// Convert a Hexadecimal Number to its Equivalent Decimal Number using BigInteger

import java.lang.*;
import java.util.*;
public class HexadecimaltoDecimal {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter HexaDecimal Number : ");
        String hex=scanner.nextLine().toUpperCase();
        System.out.println(hex+" to its Equivalent Decimal Number is : "+convertDecimal(hex));
        scanner.close();
    }
    public static int convertDecimal(String hex){
        String content="0123456789ABCDEF";
        int decimal=0;
        int index=hex.length()-1;
        for(int i=0;i<hex.length();i++){
            char c=hex.charAt(i);
            int power=content.indexOf(c);
            decimal=decimal+(power*(int)Math.pow(16,index));
            index--;
        }
        return decimal;
    }
}

/*
Output :
Enter HexaDecimal Number : c9
C9 to its Equivalent Decimal Number is : 201
 */
