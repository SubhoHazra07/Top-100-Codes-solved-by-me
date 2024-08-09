// Find Sum of Two Fraction values 
// (1/3)+(3/9)=(2/3)

import java.lang.*;
import java.util.*;
public class AddToFractions {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Fraction's Numerator : ");
        int num1=scanner.nextInt();
        System.out.print("Enter First Fraction's Denominator : ");
        int den1=scanner.nextInt();
        System.out.print("Enter Second Fraction's Numerator : ");
        int num2=scanner.nextInt();
        System.out.print("Enter Second Fraction's Denominator : ");
        int den2=scanner.nextInt();
        int numerator=(num1*den2)+(num2*den1);
        int denominator=(den1*den2);
        int hcf=gcd(numerator,denominator);
        numerator=numerator/hcf;
        denominator=denominator/hcf;
        System.out.println("("+num1+"/"+den1+")+("+num2+"/"+den2+") : ("+numerator+"/"+denominator+")");
        scanner.close();
    }
    public static int gcd(int a,int b){
        if(b==0){
            return a;
        }
        return gcd(b,a%b);
    }
}

/*
output :
Enter First Fraction's Numerator : 1
Enter First Fraction's Denominator : 3
Enter Second Fraction's Numerator : 3
Enter Second Fraction's Denominator : 9
(1/3)+(3/9) : (2/3)
 */
