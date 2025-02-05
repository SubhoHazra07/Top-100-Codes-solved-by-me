import java.util.Scanner;

public class BasicIncrementingTrianglePatternInvertedSandwich {
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
            int val=index;
            for(int j=0;j<=i;j++){
                System.out.print((val--)+" ");
            }
            System.out.println();
            index+=(i+2);
        }
        for(int i=num-1;i>=0;i--){
            int val=values[i];
            for(int j=0;j<=i;j++){
                System.out.print((val--)+" ");
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
4 3
7 6 5 
11 10 9 8
11 10 9 8
7 6 5
4 3
2
 */