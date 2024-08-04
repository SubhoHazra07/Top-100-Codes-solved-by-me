// Find Postive or Negative Number 
import java.lang.*;
import java.util.*;
class PosOrNeg{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        if(num==0){
            System.out.println("Your Entered Number is Zero");
        }else if(num>0){
            System.out.println("This is a Positive Number");
        }else{
            System.out.println("This is a Negative Number");
        }
        scanner.close();
    }
}