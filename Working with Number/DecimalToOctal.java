// Convert a Decimal Number to its Equivalent Octal Number using Arrays

import java.lang.*;
import java.util.*;
public class DecimalToOctal{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal=scanner.nextInt();
        ArrayList<Integer> binary=convertOctal(decimal);
        System.out.print(decimal+" to its Equivalent Octal Number is : ");
        for(int i=binary.size()-1;i>=0;i--){
            System.out.print(binary.get(i));
        }
        scanner.close();
    }
    public static ArrayList<Integer> convertOctal(int decimal){
        ArrayList<Integer> octal=new ArrayList<>();
        while(decimal>0){
            int rem=decimal%8;
            octal.add(rem);
            decimal/=8;
        }
        return octal;
    }
}

/*
Output : 
Enter Decimal Number : 148
148 to its Equivalent Binary Number is : 224
 */

