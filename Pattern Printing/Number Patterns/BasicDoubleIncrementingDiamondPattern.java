import java.util.Scanner;

public class BasicDoubleIncrementingDiamondPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        System.out.print("Intialize A Number : ");
        int no=scanner.nextInt();
        int index=no;
        int values[]=new int[num];
        for(int i=0;i<num;i++){
            values[i]=index;
            for(int j=0;j<=i;j++){
                System.out.print((index++)+" ");
            }
            System.out.println();
        }
        for(int i=num-2;i>=0;i--){
            index=values[i];
            for(int j=0;j<=i;j++){
                System.out.print((index++)+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Output : 
Enter the Range : 4
Intialize A Number : 3
3 
4 5 
6 7 8 
9 10 11 12 
6 7 8 
4 5 
3
 */