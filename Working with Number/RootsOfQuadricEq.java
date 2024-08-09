// Find Roots of Quadric Equation 

import java.lang.*;
import java.util.*;
public class RootsOfQuadricEq {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a : ");
        double a=scanner.nextDouble();
        System.out.print("Enter b : ");
        double b=scanner.nextDouble();
        System.out.print("Enter c : ");
        double c=scanner.nextDouble();
        double d=(b*b-4*a*c);
        double val=Math.sqrt(Math.abs(d));
        if(d>0){
            System.out.println("The roots are Real and Different");
            System.out.println("The two Roots are : "+(double)(-b+val/2*a)+" and "+(double)(-b-val/2*a));
        }else if(d==0){
            System.out.println("The roots are Real and Same");
            System.out.println("The two Roots are : "+(double)(-b/(2*a))+" and "+(double)(-b/(2*a)));
        }else{ // d<0
            System.out.println("The Roots are Complex");
            System.out.println("The two Roots are : "+(double)(-b/(2*a))+" + "+(double)(val/(2*a))+"i and "+(double)(-b/(2*a))+" - "+(double)(val/(2*a))+"i");
        }
        scanner.close();
    }
}

/*
Output :
Enter a : 1
Enter b : 4
Enter c : 4
The roots are Real and Same
The two Roots are : -2.0 and -2.0
Enter a : 2
Enter b : 3
Enter c : 2
The Roots are Complex
The two Roots are : -0.75 + 0.6614378277661477i and -0.75 - 0.6614378277661477i
 */
