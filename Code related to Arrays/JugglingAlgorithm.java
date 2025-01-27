import java.util.*;
public class JugglingAlgorithm{
    public static void leftRotate(int arr[],int d,int n){
        d=d%n;
        int gcd=findGCD(d,n);
        for(int i=0;i<gcd;i++){
            int temp=arr[i];
            int j=i;
            while(true){
                int k=j+d;
                if(k>=n){
                    k=k-n;
                }
                if(k==i){
                    break;
                }
                arr[j]=arr[k];
                j=k;
            }
            arr[j]=temp;
        }
    }
    public static int findGCD(int a,int b){
        if(b==0){
            return a;
        }
        return findGCD(b,a%b);
    }
    public static void printArray(int arr[]){
        System.out.print("After appliying Juggling Algorithm in Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Enter Number of Position to Rotate the Array : ");
        int d=scanner.nextInt();
        leftRotate(arr,d,size);
        printArray(arr);
        scanner.close();
    }
}

/*
Output : 
Enter the Size : 7
Enter 0 Element : 1
Enter 1 Element : 2
Enter 2 Element : 3
Enter 3 Element : 4
Enter 4 Element : 5
Enter 5 Element : 6
Enter 6 Element : 7
Enter Number of Position to Rotate the Array : 2
After appliying Juggling Algorithm in Array : 3 4 5 6 7 1 2
 */