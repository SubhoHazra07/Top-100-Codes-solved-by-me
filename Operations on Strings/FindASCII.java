import java.util.*;
public class FindASCII {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Character : ");
        char ch=scanner.next().charAt(0);
        System.out.println("ASCII Value of "+ch+" is "+findASCII(ch));
        scanner.close();
    }
    public static int findASCII(char c){
        return (int)c;
    }
}

/*
Output :
Enter a Character : a
ASCII Value of a is 97
Enter a Character : A
ASCII Value of A is 65
 */