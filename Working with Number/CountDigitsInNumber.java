// Count occurance of a digit in given Number

import java.lang.*;
import java.util.*;
public class CountDigitsInNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        System.out.print("Enter a Digit : ");
        int digit=scanner.nextInt();
        System.out.println(digit+" present "+countDigit(num,digit)+" times in "+num);
        scanner.close();
    }
    public static int countDigit(int num,int digit){
        int count=0;
        while(num>0){
            int rem=num%10;
            if(rem==digit){
                count++;
            }
            num/=10;
        }
        return count;
    }
}

/*
Output :
Enter a Number : 12115
Enter a Digit : 1
1 present 3 times in 12115
 */
