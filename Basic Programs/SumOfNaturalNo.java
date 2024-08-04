// Calculate the Sum of N Natural Numbers

import java.lang.*;
import java.util.*;
public class SumOfNaturalNo {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        int sum=0;
        for(int i=1;i<=num;i++){
            sum+=i;
        }
        System.out.println("Sum of "+num+" Natural No is : "+sum);
        scanner.close();
    }
}

/* Output :
Enter the Range : 54
Sum of 54 Natural No is : 1485
 */
