// Replace all 0’s with 1 in a given integer using String

import java.lang.*;
import java.util.*;
public class Replace0to1usingString{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        long num=scanner.nextLong();
        System.out.println(num+" after Replacing all 0's : "+replace(num));
        scanner.close();
    }
    public static long replace(long num){
        String n=Long.toString(num);
        String result="";
        for(int i=0;i<n.length();i++){
            if(n.charAt(i)=='0'){
                result+='1';
            }else{
                result+=n.charAt(i);
            }
        }
        return Long.parseLong(result);
    }
}

/*
Output : 
Enter a Number : 5466200000324
5466200000324 after Replacing all 0's : 5466211111324
 */
