import java.util.*;
public class RectangleStarPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int row=scanner.nextInt();
        System.out.print("Enter the Column : ");
        int col=scanner.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Enter the Row : 4
Enter the Column : 5
*****
*****
*****
*****
 */