// Calculate Area of a Circle

import java.lang.*;
import java.util.*;
public class AreaOfCircle {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter Radius of a Circle : ");
        double radius=scanner.nextDouble();
        System.out.println("Area of a Circle : "+Math.PI*radius*radius);
        scanner.close();
    }
}

/*
Output : 
Enter Radius of a Circle : 7
Area of a Circle : 153.93804002589985
 */
