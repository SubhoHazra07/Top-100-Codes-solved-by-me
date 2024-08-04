// Check Whether the Number is Armstrong Number or Not

import java.lang.*;
import java.util.*;
public class Armstrong {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(armstrong(num)){
            System.out.println(num+" is an Armstrong Number");
        }else{
            System.out.println(num+" is not an Armstrong Number");
        }
        scanner.close();
    }
    public static boolean armstrong(int num){
        int power=String.valueOf(num).length();
        int temp=num;
        int sum=0;
        while(num>0){
            int base=num%10;
            sum+=Math.pow(base,power);
            num/=10;
        }
        return temp==sum;
    }
}

/*
Output : 
Enter a Number : 1634
1634 is an Armstrong Number
Enter a Number : 143
143 is not an Armstrong Number
 */