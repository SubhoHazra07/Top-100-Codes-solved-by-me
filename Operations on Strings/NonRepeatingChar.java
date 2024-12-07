import java.util.*;
public class NonRepeatingChar {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        nonRepeatingChar(str);
        scanner.close();
    }
    public static void nonRepeatingChar(String s){
        boolean flag=true;
        String str=s.toLowerCase();
        for(char i:str.toCharArray()){
            if(str.indexOf(i)==str.lastIndexOf(i)){
                System.out.println("First Non-repeating character is : "+i);
                flag=false;
                break;
            }
        }
        if(flag){
            System.out.println("There is No repeating character in Input String");
        }
    }
}

/*
Output :
Enter the String : What do you want from me ?
First Non-repeating character is : h
 */