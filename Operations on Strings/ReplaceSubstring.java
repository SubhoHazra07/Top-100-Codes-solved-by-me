import java.util.*;
public class ReplaceSubstring {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Original String : ");
        String originalString=scanner.nextLine();
        System.out.print("Enter Substring : ");
        String subString=scanner.nextLine();
        System.out.print("Enter New String : ");
        String newString=scanner.nextLine();
        if(!originalString.contains(subString)){
            System.out.println("There is no Substring to Replace");
        }else{
            System.out.println("After replacing "+subString+" with "+newString+" from "+originalString+" is : "+originalString.replaceAll(subString, newString));
        }
        scanner.close();
    }
}
