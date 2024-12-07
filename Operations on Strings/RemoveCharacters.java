import java.util.*;
public class RemoveCharacters {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        str=str.replaceAll("[^a-zA-Z]","");
        System.out.println("After Removing all Characters except String : "+str);
        scanner.close();
    }
}

/*
Output :
Enter the String : Subho#$Shweta
After Removing all Characters except String : SubhoShweta
 */