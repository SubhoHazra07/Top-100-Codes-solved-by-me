import java.util.*;
public class MinimumScalarProduct{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr1[]=new int[size];
        System.out.println("Enter 1st Array Elements !");
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr1[i]=scanner.nextInt();
        }
        Integer arr2[]=new Integer[size];
        System.out.println("Enter 2nd Array Elements !");
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr2[i]=scanner.nextInt();
        }
        System.out.println("Minimum Scalar of Two Vectors : "+scalarProduct(arr1,arr2));
        scanner.close();
    }
    public static int scalarProduct(int arr1[],Integer arr2[]){
        Arrays.sort(arr1);
        Arrays.sort(arr2,Collections.reverseOrder());
        int product=0;
        for(int i=0;i<arr1.length;i++){
            product+=(arr1[i]*arr2[i]);
        }
        return product;
    }
}

/*
Enter the Size : 4
Enter 1st Array Elements !
Enter 0 Element : 10
Enter 1 Element : 30
Enter 2 Element : 40
Enter 3 Element : 20
Enter 2nd Array Elements !
Enter 0 Element : 2
Enter 1 Element : 4
Enter 2 Element : 5
Enter 3 Element : 1
Minimum Scalar of Two Vectors : 230
*/