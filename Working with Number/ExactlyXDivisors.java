// Count Number of integers which has exactly X divisors

import java.lang.*;
import java.util.*;
public class ExactlyXDivisors {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Range : ");
        int num=scanner.nextInt();
        System.out.print("Enter X : ");
        int x=scanner.nextInt();
        System.out.println("Number of Integers which has exactly X divisor is : "+countNumbers(num,x));
        scanner.close();
    }
    public static int countNumbers(int num,int x){
        int count=0;
        for(int i=1;i<=num;i++){
            int countFactors=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    countFactors++;
                }
            }
            if(countFactors==x){
                count++;
            }
        }
        return count;
    }
}

/*
Output :
Enter a Range : 7
Enter X : 2
Number of Integers which has exactly X divisor is : 4
 */
