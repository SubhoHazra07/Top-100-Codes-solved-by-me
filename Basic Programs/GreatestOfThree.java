// Find Greatest Among Three Numbers

import java.lang.*;
import java.util.*;
public class GreatestOfThree {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Number : ");
        int a=scanner.nextInt();
        System.out.print("Enter Second Number : ");
        int b=scanner.nextInt();
        System.out.print("Enter Third Number : ");
        int c=scanner.nextInt();
        if(a==b&&b==c){
            System.out.println("Three Numbers are Equal");
        }else{
            System.out.println(findGreatest(a,b,c)+" is the Greatest Number");
        }
        scanner.close();
    }
    public static int findGreatest(int a,int b,int c){
        if(a>=b&&a>=c){
            return a;
        }else if(b>=c&&b>=a){
            return b;
        }else{
            return c;
        }
    }
}

/*
Output :
Enter First Number : 5
Enter Second Number : 5
Enter Third Number : 3
5 is the Greatest Number
 */
