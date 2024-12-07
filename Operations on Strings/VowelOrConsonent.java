import java.util.*;
public class VowelOrConsonent{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch=scanner.next().charAt(0);
        System.out.println(ch+" is "+checkCharacter(ch));
        scanner.close();
    }
    public static String checkCharacter(char c){
        char ch=Character.toLowerCase(c);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
            return "Vowel";
        }
        return "Consonent";
    }
}

/*
Output :
Enter a Character : A
A is Vowel
 */