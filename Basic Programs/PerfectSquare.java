// Check the given Number is Perfect Square

import java.lang.*;
import java.util.*;
public class PerfectSquare {
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
        for(int i=1;i*i<=num;i++){
            if(num%i==0 && num/i==i){
                return true;
            }
        }
        return false;
    }
}

/*
Output :
Enter a Number : 4
4 is a Perfect Square Number
Enter a Number : 21
21 is not a Perfect Square Number
 */
