import java.util.*;
public class RemoveVowels {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("After Removing Vowels from "+str+" : "+removeVowels(str));
        scanner.close();
    }
    public static String removeVowels(String str){
        String result="";
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                continue;
            }else{
                result+=ch;
            }
        }
        return result;
    }
}

/*
Output:
Enter the String : You are cute
After Removing Vowels from You are cute : Y r ct
 */