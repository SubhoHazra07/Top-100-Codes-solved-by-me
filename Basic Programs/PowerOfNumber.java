// Find the Power of a Number 

import java.lang.*;
import java.util.*;
public class PowerOfNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Base : ");
        double base=scanner.nextDouble();
        System.out.print("Enter the Exponent : ");
        double exp=scanner.nextDouble();
        System.out.println(base+" to the Power "+exp+": "+Math.pow(base,exp)); // using In-built Function
        System.out.println(base+" to the Power "+exp+": "+powerOfNumber(base,exp)); // using For Loop or we can use While Loop
        System.out.println(base+" to the Power "+exp+": "+power(base,exp)); // using Recursion
        scanner.close();
    }
    public static double powerOfNumber(double a,double b){
        double mul=1;
        for(int i=1;i<=b;i++){
            mul*=a;
        }
        return mul;
    }
    public static double power(double a,double b){
        if(b==0){
            return 1;
        }
        double mul=a*power(a,b-1);
        return mul;
    }
}

/*
Output :
Enter the Base : 1.5
Enter the Exponent : 2
1.5 to the Power 2.0: 2.25
1.5 to the Power 2.0: 2.25
1.5 to the Power 2.0: 2.25
 */
