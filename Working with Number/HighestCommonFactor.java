// Find the Highest Common Factor between Two Numbers

import java.lang.*;
import java.util.*;
public class HighestCommonFactor{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=scanner.nextInt();
        System.out.println("Highest Common Factor of "+num1+" and "+num2+" is : "+findHCF(num1,num2));
        scanner.close();
    }
    public static int findHCF(int a,int b){
        if(b==0){
            return a;
        }
        return findHCF(b,a%b); // a=36 , b=60 then a = b = 60 , b = a%b = 36 ; a = b = 36 , b = a%b = 12 ; a = b = 12 , b = a%b = 0 ; b == 0 then return a = 12
    }
}

/*
Output : 
Enter First Number : 36
Enter Second Number : 60
Highest Common Factor of 36 and 60 is : 12
 */