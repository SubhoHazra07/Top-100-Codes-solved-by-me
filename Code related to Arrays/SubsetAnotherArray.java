import java.util.*;

public class SubsetAnotherArray {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First Array Size : ");
        int size1=scanner.nextInt();
        int arr1[]=new int[size1];
        System.out.println("Enter 1st Array Elements !");
        for(int i=0;i<size1;i++){
            System.out.print("Enter "+i+" Element : ");
            arr1[i]=scanner.nextInt();
        }
        System.out.print("Enter Second Array Size : ");
        int size2=scanner.nextInt();
        int arr2[]=new int[size2];
        System.out.println("Enter 2nd Array Elements !");
        for(int i=0;i<size2;i++){
            System.out.print("Enter "+i+" Element : ");
            arr2[i]=scanner.nextInt();
        }
        if(arr1.length>arr2.length && isSubset(arr1,arr2)){
            System.out.println("arr2 is a subset of arr1");
        }else if(arr2.length>arr1.length && isSubset(arr2,arr1)){
            System.out.println("arr1 is a subset of arr2");
        }else{
            System.out.println("Not a Subset");
        }
        scanner.close();
    }
    public static boolean isSubset(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(!set.contains(i)){
                return false;
            }
        }
        return true;
    }
}

/*
Enter First Array Size : 3
Enter 1st Array Elements !
Enter 0 Element : 3
Enter 1 Element : 4
Enter 2 Element : 5
Enter Second Array Size : 5
Enter 2nd Array Elements !
Enter 0 Element : 1
Enter 1 Element : 2
Enter 2 Element : 3
Enter 3 Element : 4
Enter 4 Element : 5
arr1 is a subset of arr2
 */