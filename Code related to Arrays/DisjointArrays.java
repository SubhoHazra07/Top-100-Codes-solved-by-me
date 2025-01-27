import java.util.*;
public class DisjointArrays {
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
        if(checkDisjoint(arr1,arr2)){
            System.out.println("The Arrays are Disjoint.");
        }else{
            System.out.println("The Arrays are not Disjoint.");
        }
        scanner.close();
    }
    public static boolean checkDisjoint(int arr1[],int arr2[]){
        HashSet<Integer> set=new HashSet<>();
        for(int i:arr1){
            set.add(i);
        }
        for(int i:arr2){
            if(set.contains(i)){
                return false;
            }
        }
        return true;
    }
}

/*
Output : 
Enter First Array Size : 3
Enter 1st Array Elements !
Enter 0 Element : 1
Enter 1 Element : 2
Enter 2 Element : 3
Enter Second Array Size : 4
Enter 2nd Array Elements !
Enter 0 Element : 4
Enter 1 Element : 5
Enter 2 Element : 6
Enter 3 Element : 7
The Arrays are Disjoint.

Enter First Array Size : 4
Enter 1st Array Elements !
Enter 0 Element : 1
Enter 1 Element : 2
Enter 2 Element : 3
Enter 3 Element : 4
Enter Second Array Size : 5
Enter 2nd Array Elements !
Enter 0 Element : 4
Enter 1 Element : 5
Enter 2 Element : 6
Enter 3 Element : 7
Enter 4 Element : 8
The Arrays are not Disjoint.
 */