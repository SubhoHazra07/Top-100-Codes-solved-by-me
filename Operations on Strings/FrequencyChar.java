import java.util.*;
public class FrequencyChar {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        freqCharacter(str);
        scanner.close();
    }
    public static void freqCharacter(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        String str=s.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        for(Map.Entry p:map.entrySet()){
            System.out.println(p.getKey()+" Occurs "+p.getValue()+" Times");
        }
    }
}

/*
Output :
Enter the String : The quick brown fox jumps over the lazy dog
  Occurs 8 Times
a Occurs 1 Times
b Occurs 1 Times
c Occurs 1 Times
d Occurs 1 Times
e Occurs 3 Times
f Occurs 1 Times
g Occurs 1 Times
h Occurs 2 Times
i Occurs 1 Times
j Occurs 1 Times
k Occurs 1 Times
l Occurs 1 Times
m Occurs 1 Times
n Occurs 1 Times
o Occurs 4 Times
p Occurs 1 Times
q Occurs 1 Times
r Occurs 2 Times
s Occurs 1 Times
t Occurs 2 Times
u Occurs 2 Times
v Occurs 1 Times
w Occurs 1 Times
x Occurs 1 Times
y Occurs 1 Times
z Occurs 1 Times
 */
