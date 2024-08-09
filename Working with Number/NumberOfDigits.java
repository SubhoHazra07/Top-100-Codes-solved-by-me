// Find Number of Digits in an Interger

import java.lang.*;
import java.util.*;
public class NumberOfDigits {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        System.out.println("Number of Digits in "+num+" is : "+findDigits(num));
        int result=(int)Math.log10(num)+1;
        System.out.println("Number of Digits in "+num+" is (by using Formula) : "+result);
        scanner.close();
    }
    public static int findDigits(int num){
        int count=0;
        while(num>0){
            num/=10;
            count++;
        }
        return count;
    }
}

/*
Output :
Enter a Number : 1002345
Number of Digits in 1002345 is : 7
Number of Digits in 1002345 is (by using Formula) : 7
 */
