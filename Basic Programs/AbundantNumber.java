// Check Whether or Not the Number is an Abundant Number
/*Explanation : The Factors for the number 18 are, 1, 2, 3, 6 and 9. We don't want to include the number itself.
Now the sum of the factors except the number itself is :
1 + 2 + 3 + 6 + 9 = 21
as the number 21>18 , the number itself.*/

import java.lang.*;
import java.util.*;
public class AbundantNumber {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkAbundant(num)){
            System.out.println(num+" is an Abundant Number");
        }else{
            System.out.println(num+" is not an Abundant Number");
        }
        scanner.close();
    }
    public static boolean checkAbundant(int num){
        int sum=0;
        for(int i=1;i<=(num/2);i++){
            sum+=i;
        }
        if(sum>num){
            return true;
        }
        return false;
    }
}

/*
Output :
Enter a Number : 18
18 is an Abundant Number
Enter a Number : 6
6 is not an Abundant Number
 */
