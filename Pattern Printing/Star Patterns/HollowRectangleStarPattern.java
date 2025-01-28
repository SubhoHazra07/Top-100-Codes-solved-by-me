import java.util.*;
public class HollowRectangleStarPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Row : ");
        int row=scanner.nextInt();
        System.out.print("Enter the Column : ");
        int col=scanner.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if((i==0||i==row-1)||(j==0||j==col-1)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}

/*
Output :
Enter the Row : 4
Enter the Column : 5
*****
*   *
*   *
*****
 */
