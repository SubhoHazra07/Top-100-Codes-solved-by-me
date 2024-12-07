import java.util.*;
public class LengthOfString {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("Length of the String is "+lengthOfString(str));
        scanner.close();
    }
    public static int lengthOfString(String str){
        int length=0;
        for(char ch:str.toCharArray()){
            length++;
        }
        return length;
    }
}
