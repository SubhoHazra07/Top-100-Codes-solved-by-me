// Check the Number is Perfect Square or Not

import java.lang.*;
import java.util.*;
import java.math.*;
public class PerfectSquareUsingSQRT {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(checkNumbers(num)){
            System.out.println(num+" is a Perfect Square Number");
        }else{
            System.out.println(num+" is not a Perfect Square Number");
        }
        scanner.close();
    }
    public static boolean checkNumbers(int num){
        double square=Math.sqrt(num);
        return (square-Math.floor(square))==0;
    }
}

/*
Output :
Enter a Number : 25
25 is a Perfect Square Number
Enter a Number : 21
21 is not a Perfect Square Number
 */
