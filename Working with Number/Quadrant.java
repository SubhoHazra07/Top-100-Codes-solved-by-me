// Find out the Quadrant in which the given Co-ordinate lies
/*
Get value of x & y
If ( x>0 and y>0 ) First Quadrant
If ( x<0 and y>0 ) Second Quadrant
If ( x<0 and y<0 ) Third Quadrant
If ( x>0 and y<0 ) Fourth Quadrant
If ( x=0 and y=0 ) Origin
If ( x==0 and y!=0 ) x-axis
If ( x!=0 and y==0 ) y-axis
 */

import java.lang.*;
import java.util.*;
public class Quadrant {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter x : ");
        int x=scanner.nextInt();
        System.out.print("Enter y : ");
        int y=scanner.nextInt();
        if(x>0 && y>0){
            System.out.print("("+x+","+y+") point lies on First Quadrant");
        }else if(x<0 && y>0){
            System.out.print("("+x+","+y+") point lies on Second Quadrant");
        }else if(x<0 && y<0){
            System.out.print("("+x+","+y+") point lies on Third Quadrant");
        }else if(x>0 && y<0){
            System.out.print("("+x+","+y+") point lies on Fourth Quadrant");
        }else if(x==0 && y==0){
            System.out.print("("+x+","+y+") point lies on Origin");
        }else if(x==0 && y!=0){
            System.out.print("("+x+","+y+") point lies on x-axis");
        }else{
            System.out.print("("+x+","+y+") point lies on y-axis");
        }
        scanner.close();
    }
}
/*
Output :
Enter x : 2
Enter y : 3
(2,3) point lies on First Quadrant
Enter x : -2
Enter y : 3
(-2,3) point lies on Second Quadrant
Enter x : -2
Enter y : -3
(-2,-3) point lies on Third Quadrant
Enter x : 2
Enter y : -3
(2,-3) point lies on Fourth Quadrant
Enter x : 0
Enter y : 0
(0,0) point lies on Origin
Enter x : 0
Enter y : 3
(0,3) point lies on x-axis
Enter x : 2
Enter y : 0
(2,0) point lies on y-axis
 */
