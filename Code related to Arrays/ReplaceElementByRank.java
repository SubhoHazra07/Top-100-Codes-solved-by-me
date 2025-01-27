import java.util.*;

public class ReplaceElementByRank {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        replaceElements(size,arr);
        scanner.close();
    }
    public static void replaceElements(int num,int arr[]){
        System.out.println("Original Array : "+Arrays.toString(arr));
        int sortedArray[]=arr.clone();
        Arrays.sort(sortedArray);
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<sortedArray.length;i++){
            map.put(sortedArray[i],i+1);
        }
        for(int i=0;i<arr.length;i++){
            arr[i]=map.get(arr[i]);
        }
        System.out.println("Array After Replacing with Ranks: "+Arrays.toString(arr));
    }
}

/*
Output : 
Enter the Size : 4
Enter 0 Element : 40
Enter 1 Element : 20
Enter 2 Element : 10
Enter 3 Element : 30
Original Array : [40, 20, 10, 30]
Array After Replacing with Ranks: [4, 2, 1, 3]
 */
