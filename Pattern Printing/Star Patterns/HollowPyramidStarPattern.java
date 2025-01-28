import java.util.Scanner;

public class HollowPyramidStarPattern {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Range : ");
        int num=scanner.nextInt();
        for(int i=0;i<num;i++){
            for(int j=0;j<num-i-1;j++){
                System.out.print(" ");
            }
            for(int k=0;k<(2*i+1);k++){
                if((i==0||i==num-1)||(k==0||k==2*i)){
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
Enter the Range : 4
   *
  * *
 *   *
*******
 */