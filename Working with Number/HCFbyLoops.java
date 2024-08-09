// Find the Highest Commong Factor using Loop

import java.lang.*;
import java.util.*;
public class HCFbyLoops {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int num1=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int num2=scanner.nextInt();
        System.out.println("Highest Common Factor of "+num1+" and "+num2+" is : "+findHCF(num1,num2));
        scanner.close();
    }
    public static int findHCF(int num1,int num2){
        int hcf=0;
        for(int i=1;i<=num1 || i<=num2;i++){
            if(num1%i==0 && num2%i==0){
                hcf=i;
            }
        }
        return hcf;
    }
}

/*
Output : 
Enter First Number : 0
Enter Second Number : 8
Highest Common Factor of 0 and 8 is : 8
 */
