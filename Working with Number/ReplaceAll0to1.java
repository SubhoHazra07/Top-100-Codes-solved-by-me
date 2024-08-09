// Replace all 0’s with 1 in a given integer 

import java.lang.*;
import java.util.*;
public class ReplaceAll0to1 {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long num=scanner.nextLong();
        System.out.println(num+" after Replacing all 0's : "+replace(num));
        scanner.close();
    }
    public static long replace(long num){
        long sum=0;
        int index=0;
        while(num>0){
            long rem=num%10;
            if(rem==0){
                rem=1;
            }
            sum+=rem*Math.pow(10,index);
            num/=10;
            index++;
        }
        return sum;
    }
}

/*
Output : 
Enter a Number : 542200048510
542200048510 after Replacing all 0's : 542211148511
 */
