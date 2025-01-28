import java.util.*;
public class SquareStarPattern{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Output : 
Enter the Range : 4
****
****
****
****
 */