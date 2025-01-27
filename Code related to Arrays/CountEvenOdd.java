import java.util.*;
public class CountEvenOdd{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        countEvenOdd(size,arr);
        scanner.close();
    }
    public static void countEvenOdd(int num,int arr[]){
        int even=0;
        int odd=0;
        for(int i:arr){
            if(i%2==0){
                even++;
            }else{
                odd++;
            }
        }
        System.out.println("Number of Even Elements in Array : "+even);
        System.out.println("Number of Odd Elements in Array : "+odd);
    }
}

/*
Enter the Size : 6
Enter 0 Element : 5
Enter 1 Element : 2
Enter 2 Element : 9
Enter 3 Element : 7
Enter 4 Element : 3
Enter 5 Element : 6
Number of Even Elements in Array : 2
Number of Odd Elements in Array : 4
*/