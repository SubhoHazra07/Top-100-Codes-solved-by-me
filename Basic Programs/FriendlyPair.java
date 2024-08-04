// Check Whether or Not the Two Numbers are a Friendly Pair 
/*
Explanation : The factors of 6 and 28 except the numbers themselves are 1, 2, 3 and 1, 2, 4, 7, 14 respectively.
Now the sum of factors of both the numbers are 6 and 28 respectively. 
When we divide the sums with the numbers we get 1 and 1 respectively. 
As the ratio of both the number match, they are considered as a friendly pair.
 */

import java.lang.*;
import java.util.*;
public class FriendlyPair {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int b=scanner.nextInt();
        if((b*sumOfFactors(a))==(a*sumOfFactors(b))){
            System.out.println(a+" and "+b+" are Friendly Pairs");
        }else{
            System.out.println(a+" and "+b+" are not Friendly Pairs");
        }
        scanner.close();
    }
    public static int sumOfFactors(int num){
        int sum=0;
        for(int i=1;i<=(num/2);i++){
            if(num%i==0){
                sum+=i;
            }
        }
        return sum;
    }
}

/*
Output :
Enter First Number : 6
Enter Second Number : 28
6 and 28 are Friendly Pairs
Enter First Number : 15
Enter Second Number : 32
15 and 32 are not Friendly Pairs
 */
