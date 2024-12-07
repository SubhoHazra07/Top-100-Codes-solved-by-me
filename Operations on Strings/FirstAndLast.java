import java.util.*;
public class FirstAndLast{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("Revised String : "+revisedString(str));
        scanner.close();
    }
    public static String revisedString(String str){
        String result=Character.toUpperCase(str.charAt(0))+"";
        if(str.length()==1){
            return result;
        }
        for(int i=1;i<str.length()-1;i++){
            if(str.charAt(i)>='a' && str.charAt(i)<='z' && str.charAt(i+1)==' '){
                result+=Character.toUpperCase(str.charAt(i))+" "+Character.toUpperCase(str.charAt(i+2));
                i+=2;
            }else{
                result+=str.charAt(i);
            }
        }
        result+=Character.toUpperCase(str.charAt(str.length()-1));
        return result;
    }
}

/*
Output :
Enter the String : subho hazra
Revised String : SubhO HazrA
 */