import java.util.*;
public class BasicDoubleIncrementingPatternInverted {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        System.out.print("Intialize A Number : ");
        int no=scanner.nextInt();
        int index=num*(num+1)/2;
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i;j++){
                System.out.print(index+no-1+" ");
                index--;
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
12 11 10 9
8 7 6
5 4 
3
 */