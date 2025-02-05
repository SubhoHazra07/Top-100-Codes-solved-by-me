import java.util.Scanner;

public class BasicIncrementingDiamondPatternInvertedSandwich {
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
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(num-i-1+no);
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Output : 
Enter the Range : 4
Intialize A Number : 2
2
33
444
5555
5555
444
33
2
 */