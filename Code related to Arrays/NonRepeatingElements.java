import java.util.*;
public class NonRepeatingElements {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        nonRepeatingElements(size,arr);
        scanner.close();
    }
    public static void nonRepeatingElements(int num,int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        System.out.print("Non repeating Elements are : ");
        for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
            if (entry.getValue()==1) {
                System.out.print(entry.getKey()+" ");
            }
        }
    }
}

/*
Output : 
Enter the Size : 8
Enter 0 Element : 10
Enter 1 Element : 30
Enter 2 Element : 40
Enter 3 Element : 20
Enter 4 Element : 10
Enter 5 Element : 20
Enter 6 Element : 50
Enter 7 Element : 10
Non repeating Elements are : 50 40 30
 */
