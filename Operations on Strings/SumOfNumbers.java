import java.util.*;
public class SumOfNumbers {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String str=scanner.nextLine();
        System.out.println("Sum of all Numbers in the String : "+sumOfNumbers(str));
        scanner.close();
    }
    public static int sumOfNumbers(String str){
        int sum=0;
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch>='0'&&ch<='9'){
                sum+=(ch-'0');
            }
        }
        return sum;
    }
}

/*
Output :
Enter the String : ShwetaDas01SubhoHazra007
Sum of all Numbers in the String : 8
 */
