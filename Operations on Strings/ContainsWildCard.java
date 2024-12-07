import java.util.*;
public class ContainsWildCard {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1=scanner.nextLine();
        System.out.print("Enter Second String : ");
        String str2=scanner.nextLine();
        if(containsWildCard(str1,str2)){
            System.out.println("Strings are matching!!!");
        }else{
            System.out.println("Strings are not matching!!!");
        }
        scanner.close();
    }
    public static boolean containsWildCard(String s1,String s2){
        if(s1.length()==0 && s2.length()==0){
            return true;
        }
        if(s1.length()>1 && s1.charAt(0)=='*'){
            int i=0;
            while(i+1<s1.length() && s1.charAt(i+1)=='*'){
                i++;
            }
            s1=s1.substring(i);
        }

        if(s1.length()>1 && s1.charAt(0)=='*' && s2.length()==0){
            return false;
        }

        if((s1.length()>1 && s1.charAt(0)=='?')||(s1.length()!=0 && s2.length()!=0 && s1.charAt(0)==s2.charAt(0))){
            return containsWildCard(s1.substring(1), s2.substring(1));
        }

        if(s1.length()>0 && s1.charAt(0)=='*'){
            return containsWildCard(s1.substring(1), s2)||containsWildCard(s1, s2.substring(1));
        }

        return false;
    }
}

/*
Output :
Enter First String : sub*o
Enter Second String : subho
Strings are matching!!!

Enter First String : sub*o
Enter Second String : shweta
Strings are not matching!!!
 */
