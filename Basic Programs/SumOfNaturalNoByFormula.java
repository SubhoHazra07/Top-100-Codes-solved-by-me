// Sum of First N Natural Numbers

import java.lang.*;
import java.util.*;
public class SumOfNaturalNoByFormula {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        int sum=(num*(num-1))/2;
        System.out.println("Sum of First "+num+" Natural Number is : "+sum);
        scanner.close();
    }
}

/*
Output : 
Enter the Range : 55
Sum of First 55 Natural Number is : 1485
 */