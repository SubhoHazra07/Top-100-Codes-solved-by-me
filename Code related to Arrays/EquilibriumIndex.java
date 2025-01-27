import java.util.*;

public class EquilibriumIndex {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter the Size : ");
        int size=scanner.nextInt();
        int arr[]=new int[size];
        for(int i=0;i<size;i++){
            System.out.print("Enter "+i+" Element : ");
            arr[i]=scanner.nextInt();
        }
        int result=equilibriumIndex(size,arr);
        if(result==-1){
            System.out.println("No Equilibrium Index Found in The Array.");
        }else{
            System.out.println("Equilibrium Index found at Index : "+result);
        }
        scanner.close();
    }
    public static int equilibriumIndex(int num,int arr[]){
        int sum=0;
        int leftSum=0;
        for(int i:arr){
            sum+=i;
        }
        for(int i=0;i<num;i++){
            sum-=arr[i];
            if(leftSum==sum){
                return i;
            }
            leftSum+=arr[i];
        }
        return -1;
    }
}
