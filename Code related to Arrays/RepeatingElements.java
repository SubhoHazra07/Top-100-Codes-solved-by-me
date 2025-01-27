import java.util.*;

public class RepeatingElements {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        repeatingElements(size,arr);
        scanner.close();
    }
    public static void repeatingElements(int n,int arr[]){
        HashSet<Integer> set=new HashSet<>();
        System.out.print("Repeating Elements are : ");
        for(int i:arr){
            if(set.contains(i)){
                System.out.print(i+" ");
            }else{
                set.add(i);
            }
        }
    }
}

/*
Output :
Enter the Size : 6
Enter 0 Element : 50
Enter 1 Element : 30
Enter 2 Element : 20
Enter 3 Element : 30
Enter 4 Element : 20
Enter 5 Element : 50
Repeating Elements are : 30 20 50
 */
