import java.util.*;
public class RemoveSpaces {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("After removing all Spaces : "+removeSpaces(str));
        scanner.close();
    }
    public static String removeSpaces(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)!=' '){
                result+=str.charAt(i);
            }
        }
        return result;
    }
}

/*
Output :
Enter the String : Reset Restart Refocus
After removing all Spaces : ResetRestartRefocus
 */
