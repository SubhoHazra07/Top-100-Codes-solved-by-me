import java.util.Scanner;

public class BasicDoubleIncrementingPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        System.out.print("Intialize A Number : ");
        int no=scanner.nextInt();
        int index=0;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(index+no+" ");
                index++;
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Enter the Range : 4
Intialize A Number : 3
3
4 5 
6 7 8
9 10 11 12
 */