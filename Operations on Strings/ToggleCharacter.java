import java.util.*;
public class ToggleCharacter {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("After Toggle in each Character : "+toggleCharacter(str));
        scanner.close();
    }
    public static String toggleCharacter(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                result+=Character.toLowerCase(ch);
            }else{
                result+=Character.toUpperCase(ch);
            }
        }
        return result;
    }
}


/*
Output :
Enter the String : My Pookie
After Toggle in each Character : mY pOOKIE
 */