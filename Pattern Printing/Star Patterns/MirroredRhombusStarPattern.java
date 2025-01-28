import java.util.Scanner;

public class MirroredRhombusStarPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
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

/*
Output : 
Enter the Range : 4
   ****
  ****
 ****
****
 */
