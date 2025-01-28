import java.util.*;
public class DiamondStarPattern {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        for(int i=1;i<=num;i++) {
            for(int j=1;j<=num-i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i-1);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1;i<num;i++) {
            for(int j=1;j<=i;j++) {
                System.out.print(" ");
            }
            for(int j=1;j<=(2*num-1)-(2*i);j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

/*
Enter the Range : 4
   *
  ***
 *****
*******
 *****
  ***
   *
 */