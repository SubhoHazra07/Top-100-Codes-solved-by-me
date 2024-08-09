// Find Longest Common Multiple of Two Numbers

import java.lang.*;
import java.util.*;
public class LowestCommonMultiple {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=scanner.nextInt();
        int lcm=(num1*num2)/findHCF(num1,num2);
        System.out.println("Longest Common Factor of "+num1+" and "+num2+" is : "+lcm);
        scanner.close();
    }
    public static int findHCF(int num1,int num2){
        if(num2==0){
            return num1;
        }
        return findHCF(num2,num1%num2);
    }
}

/*
Output : 
Enter First Number : 36
Enter Second Number : 60
Longest Common Factor of 36 and 60 is : 180
 */
