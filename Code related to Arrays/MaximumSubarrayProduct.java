import java.util.*;
public class MaximumSubarrayProduct {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Maximum Product of Subarray : "+maxProduct(size,arr));
        scanner.close();
    }
    public static int maxProduct(int num,int arr[]){
        int result=arr[0];
        for(int i=0;i<num;i++){
            int product=arr[i];
            for(int j=i+1;j<num;j++){
                result=Math.max(result,product);
                product*=arr[j];
            }
            result=Math.max(result,product);
        }
        return result;
    }
}

/*
Output : 
Enter the Size : 7
Enter 0 Element : 10
Enter 1 Element : -20
Enter 2 Element : -30
Enter 3 Element : 0
Enter 4 Element : 70
Enter 5 Element : -80
Enter 6 Element : -20
Maximum Product of Subarray : 112000
 */