import java.util.*;
public class CountVowels {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("No of Vowels in "+str+" : "+countVowels(str));
        scanner.close();
    }
    public static int countVowels(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char ch=Character.toLowerCase(str.charAt(i));
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        return count;
    }
}

/*
Output :
Enter the String : Subho
No of Vowels in Subho : 2
 */
