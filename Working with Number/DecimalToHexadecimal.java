// Convert a Decimal Number to its Equivalent Octal Number using Arrays

import java.lang.*;
import java.util.*;
public class DecimalToHexadecimal{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal=scanner.nextInt();
        ArrayList<Character> binary=convertHexadecimal(decimal);
        System.out.print(decimal+" to its Equivalent Hexadecimal Number is : ");
        for(int i=binary.size()-1;i>=0;i--){
            System.out.print(binary.get(i));
        }
        scanner.close();
    }
    public static ArrayList<Character> convertHexadecimal(int decimal){
        String content="0123456789ABCDEF";
        ArrayList<Character> hexa=new ArrayList<>();
        while(decimal>0){
            int rem=decimal%16;
            hexa.add(content.charAt(rem));
            decimal/=16;
        }
        return hexa;
    }
}

/*
Output : 
Enter Decimal Number : 1457
1457 to its Equivalent Hexadecimal Number is : 5B1
 */


