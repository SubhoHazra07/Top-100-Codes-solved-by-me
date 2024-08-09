// Convert Digits/Numbers to Words

import java.lang.*;
import java.util.*;
public class ConvertDigitsToWords {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(num>=0 && num<=9999){
            System.out.println(num+" in Words : "+digitToWords(num));
        }else{
            System.out.println("Invalid Number !!");
        }
        scanner.close();
    }
    public static String digitToWords(int num){
        String single[]={
            "zero", "one", "two",   "three", "four",
            "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve",
            "thirteen", "fourteen", "fifteen", "sixteen",
            "seventeen", "eighteen", "nineteen"
        };
        String multiples[]={
            "", "", "twenty",  "thirty", "forty",
            "fifty", "sixty", "seventy", "eighty", "ninety"
        };
        if(num>=0 && num<=19){
            return single[num];
        }else if(num>=20 && num<=99){
            int a1=num%10;
            int b1= (num/10)%10;
            return multiples[b1]+" "+single[a1];
        }else if(num>=100 && num<=999){
            int a2=num%10;
            int b2=(num/10)%10;
            int c2=num/100;
            return single[c2]+" Hundred "+multiples[b2]+" "+single[a2];
        }else{
            int a3=num%10;
            int b3=(num/10)%10;
            int c3=num/100;
            int d3=num/1000;
            return single[d3]+" Thousand "+single[c3]+" Hundred "+multiples[b3]+" "+single[a3];
        }
    }
}

/*
Output :
Enter a Number : 3
3 in Words : three
Enter a Number : 69
69 in Words : sixty nine
Enter a Number : 108
108 in Words : one Hundred  eight
Enter a Number : 1982
1982 in Words : one Thousand nineteen Hundred eighty two
 */