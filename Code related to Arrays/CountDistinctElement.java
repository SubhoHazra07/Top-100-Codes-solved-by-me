import java.util.*;

public class CountDistinctElement {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        System.out.print("Total Distinct Elements are : "+countDistinct(size,arr));
        scanner.close();
    }
    public static int countDistinct(int n,int arr[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr){
            set.add(i);
        }
        return set.size();
    }
}

/*
Output :
Enter the Size : 6
Enter 0 Element : 20
Enter 1 Element : 10
Enter 2 Element : 20
Enter 3 Element : 30
Enter 4 Element : 10
Enter 5 Element : 40
Total Distinct Elements are : 4
 */
