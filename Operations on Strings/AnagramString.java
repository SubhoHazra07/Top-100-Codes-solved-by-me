import java.util.*;
public class AnagramString {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First String : ");
        String s1=scanner.nextLine();
        System.out.print("Enter Second String : ");
        String s2=scanner.nextLine();
        if(checkAnagram(s1,s2)){
            System.out.println("Yes, "+s1+" and "+s2+" are anagram");
        }else{
            System.out.println("No, "+s1+" and "+s2+" are not anagram");
        }
        scanner.close();
    }
    public static boolean checkAnagram(String str1,String str2){
        HashSet<Character> set=new HashSet<>();
        for(char i:str1.toCharArray()){
            set.add(i);
        }
        for(char i:str2.toCharArray()){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}

/*
Output :
Enter First String : subho
Enter Second String : shweta
No, subho and shweta are not anagram
Enter First String : shweta
Enter Second String : hawets
Yes, shweta and hawets are anagram
 */