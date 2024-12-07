import java.util.*;
public class ReverseString {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("After reversing the String : "+reverseString(str));
        scanner.close();
    }
    public static String reverseString(String str){
        String result="";
        for(int i=str.length()-1;i>=0;i--){
            result+=str.charAt(i);
        }
        return result;
    }
}

/*
Output :
Enter the String : bad
After reversing the String : dab
 */