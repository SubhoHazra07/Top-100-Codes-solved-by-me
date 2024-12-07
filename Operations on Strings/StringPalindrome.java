import java.util.*;
public class StringPalindrome {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        if(isPalindrome(str)){
            System.out.println(str+" is Palindrome");
        }else{
            System.out.println(str+" is not Palindrome");
        }
        scanner.close();
    }
    public static boolean isPalindrome(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return str.equals(result);
    }
}


/*
Output :
Enter the String : madam
madam is Palindrome
 */