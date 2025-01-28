import java.util.*;
public class RhombusStarPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=0;k<num;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}
