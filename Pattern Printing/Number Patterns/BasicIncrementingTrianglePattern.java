import java.util.Scanner;

public class BasicIncrementingTrianglePattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        System.out.print("Intialize A Number : ");
        int no=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(i+no);
            }
            System.out.println();
        }
        scanner.close();
    }
}
