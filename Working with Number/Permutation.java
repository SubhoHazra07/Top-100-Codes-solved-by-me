// Permutations in which n people can occupy r seats in a classroom 

import java.lang.*;
import java.util.*;
public class Permutation {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter No of People (n) : ");
        int n=scanner.nextInt();
        System.out.print("Enter No of Seats in a classroom (r) : ");
        int r=scanner.nextInt();
        if(n>=r && n>=0 && r>=0){
            double permutation=(factorial(n)/factorial(n-r));
            System.out.println("Permutation in which "+n+" people can occupy "+r+" seats in a classroom is : "+permutation);
        }else{
            System.out.println("Invalid Number! Please enter n>=r>=0");
        }
        scanner.close();
    }
    public static int factorial(int num){
        if(num==0||num==1){
            return 1;
        }
        int fact=num*factorial(num-1);
        return fact;
    }
}

/*
Output :
Enter No of People (n) : 9
Enter No of Seats in a classroom (r) : 5
Permutation in which 9 people can occupy 5 seats in a classroom is : 15120.0
Enter No of People (n) : 5
Enter No of Seats in a classroom (r) : 9
Invalid Number! Please enter n>=r>=0
 */