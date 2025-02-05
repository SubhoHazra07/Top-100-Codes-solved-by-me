import java.util.Scanner;

public class BasicRightTriangleNumberPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        int no=1;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print(no++);
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Output : 
Enter the Range : 4
1
23
456
78910
 */