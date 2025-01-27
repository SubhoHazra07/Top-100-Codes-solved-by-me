import java.util.*;

public class SumOfElements{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        int sum=0;
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of the Elements : "+sum);
        scanner.close();
    }
}

/*
Output :
Enter the Size : 5
Enter 0 Element : 48
Enter 1 Element : 75
Enter 2 Element : 42
Enter 3 Element : 36
Enter 4 Element : 49
Sum of the Elements : 250
 */