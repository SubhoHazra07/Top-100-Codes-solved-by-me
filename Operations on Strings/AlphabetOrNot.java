import java.util.*;
public class AlphabetOrNot {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch=scanner.next().charAt(0);
        System.out.println(ch+" is "+checkAlphabet(ch));
        scanner.close();
    }
    public static String checkAlphabet(char c){
        char ch=Character.toLowerCase(c);
        if(ch>'a' && ch<'z'){
            return "Valid Alphabet";
        }
        return "Invalid Alphabet";
    }
}

/*
Output :
Enter a Character : E
E is Valid Alphabet
Enter a Character : @
@ is Invalid Alphabet
 */
