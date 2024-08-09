// Convert a Decimal Number to its Equivalent Binary Number using Arrays

import java.lang.*;
import java.util.*;
public class DecimalToBinaryUsingArray{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Decimal Number : ");
        int decimal=scanner.nextInt();
        ArrayList<Integer> binary=convertBinary(decimal);
        System.out.print(decimal+" to its Equivalent Binary Number is : ");
        for(int i=binary.size()-1;i>=0;i--){
            System.out.print(binary.get(i));
        }
        scanner.close();
    }
    public static ArrayList<Integer> convertBinary(int decimal){
        ArrayList<Integer> binary=new ArrayList<>();
        while(decimal>0){
            int rem=decimal%2;
            binary.add(rem);
            decimal/=2;
        }
        return binary;
    }
}

/*
Output : 
Enter Decimal Number : 15
15 to its Equivalent Binary Number is : 1111
 */

