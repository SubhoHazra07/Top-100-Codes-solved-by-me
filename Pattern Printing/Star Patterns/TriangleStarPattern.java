import java.util.Scanner;

public class TriangleStarPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Enter the Range : 4
*
**
***
****
 */
