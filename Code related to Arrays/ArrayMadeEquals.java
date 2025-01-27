import java.util.*;
public class ArrayMadeEquals {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        if(isEquals(size,arr)){
            System.out.println("All the Numbers of Array made Equal");
        }else{
            System.out.println("All the Numbers of Array don't made Equal");
        }
        scanner.close();
    }
    public static boolean isEquals(int num,int arr[]){
        for(int i=0;i<num;i++){
            while(arr[i]%2==0){
                arr[i]/=2;
            }
            while(arr[i]%3==0){
                arr[i]/=3;
            }
        }
        for(int i=1;i<num;i++){
            if(arr[i]!=arr[0]){
                return false;
            }
        }
        return true;
    }
}

/*
Enter the Size : 3
Enter 0 Element : 50
Enter 1 Element : 100
Enter 2 Element : 75
All the Numbers of Array made Equal
 */