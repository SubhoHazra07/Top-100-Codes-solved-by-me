import java.util.Scanner;

public class InvertedBasicRightTriangleNumberPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        int no=(num*(num+1)/2);
        for(int i=0;i<num;i++){
            for(int j=0;j<(num-i);j++){
                System.out.print(no--);
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Output :
Enter the Range : 4
10987
654
32
1
 */