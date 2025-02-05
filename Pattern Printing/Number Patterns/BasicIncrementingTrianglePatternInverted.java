import java.util.*;

public class BasicIncrementingTrianglePatternInverted{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        System.out.print("Intialize A Number : ");
        int no=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(num-i-1+no);
            }
            System.out.println();
        }
        scanner.close();
    }
}
