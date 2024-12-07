import java.util.*;
public class RemoveBrackets {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        str=str.replaceAll("[(){}]","");
        System.out.println("After Removing all Brackets : "+str);
        scanner.close();
    }
}

/*
Output :
Enter the String : (a+b)*c/d
After Removing all Brackets : a+b*c/d
 */