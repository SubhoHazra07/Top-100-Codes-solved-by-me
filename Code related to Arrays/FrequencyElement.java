import java.util.*;

public class FrequencyElement {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        frequencyElement(size,arr);
        scanner.close();
    }
    public static void frequencyElement(int n,int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }else{
                map.put(arr[i],1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+" occurs "+entry.getValue()+" times ");
        }
    }
}

/*
Output:
Enter the Size : 9
Enter 0 Element : 1
Enter 1 Element : 5
Enter 2 Element : 4
Enter 3 Element : 4
Enter 4 Element : 5
Enter 5 Element : 1
Enter 6 Element : 8
Enter 7 Element : 3
Enter 8 Element : 3
1 occurs 2 times
3 occurs 2 times
4 occurs 2 times
5 occurs 2 times 
8 occurs 1 times
 */
