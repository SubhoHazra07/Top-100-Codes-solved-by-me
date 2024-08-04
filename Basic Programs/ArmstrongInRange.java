// Check Armstrong Number within a Range

import java.lang.*;
import java.util.*;
public class ArmstrongInRange {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Lower Limit : ");
        int lower=scanner.nextInt();
        System.out.print("Enter Upper Limit : ");
        int upper=scanner.nextInt();
        for(int i=lower;i<=upper;i++){
            if(checkArmstrong(i)){
                System.out.println(i+" is an Armstrong Number");
            }
        }
        scanner.close();
    }
    public static boolean checkArmstrong(int num){
        int power=String.valueOf(num).length();
        int temp=num;
        int sum=0;
        while(num>0){
            int base=num%10;
            sum+=Math.pow(base,power);
            num/=10;
        }
        return temp==sum;
    }
}

/*
Output : 
Enter Lower Limit : 100
Enter Upper Limit : 1000
153 is an Armstrong Number
370 is an Armstrong Number
371 is an Armstrong Number
407 is an Armstrong Number
 */