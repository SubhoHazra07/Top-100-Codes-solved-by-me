import java.util.*;
public class RemoveDuplicates{
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        removeDuplicates(size,arr);
        scanner.close();
    }
    public static void removeDuplicates(int num,int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        System.out.print("After removing Duplicates from Array : "+set);
    }
}

/*
Enter the Size : 6
Enter 0 Element : 30
Enter 1 Element : 40
Enter 2 Element : 40
Enter 3 Element : 50
Enter 4 Element : 50
Enter 5 Element : 50
After removing Duplicates from Array : [50, 40, 30]
*/