import java.util.*;
public class MinimumAbsoluteDifference {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.println("Sum of Minimum Absolute Difference is : "+sumOfMinAbs(size,arr));
        scanner.close();
    }
    public static int sumOfMinAbs(int size,int arr[]){
        if(size==1){
            return 0;
        }
        if(size==2){
            return Math.abs(arr[1]-arr[0]);
        }
        Arrays.sort(arr);
        int sum=0;
        sum+=Math.abs(arr[1]-arr[0]);
        sum+=Math.abs(arr[size-1]-arr[size-2]);
        for(int i=1;i<size-1;i++){
            sum+=Math.min(Math.abs(arr[i]-arr[i-1]),Math.abs(arr[i]-arr[i+1]));
        }
        return sum;
    }
}

/*
Output : 
Enter the Size : 4
Enter 0 Element : 2
Enter 1 Element : 4
Enter 2 Element : 5
Enter 3 Element : 3
Sum of Minimum Absolute Difference is : 4
 */