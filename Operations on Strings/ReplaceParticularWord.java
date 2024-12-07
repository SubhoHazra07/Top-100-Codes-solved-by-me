import java.util.*;
public class ReplaceParticularWord {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Original String : ");
        String originalString=scanner.nextLine();
        System.out.print("Enter Word to Replace : ");
        String word=scanner.nextLine();
        System.out.print("Enter New Word : ");
        String newWord=scanner.nextLine();
        System.out.println("After Manupulating the String : "+replaceWords(originalString.toLowerCase(),word,newWord));
        scanner.close();
    }    
    public static String replaceWords(String str,String old,String newWord){
        String text[]=str.split(" ");
        String result="";
        for(String word:text){
            if(word.equals(old)){
                result+=newWord+" ";
            }else{
                result+=word+" ";
            }
        }
        return result;
    }
}

/*
Output :
Enter Original String : Hare Krishna
Enter Word to Replace : hare
Enter New Word : radhe
After Manupulating the String : radhe krishna
 */