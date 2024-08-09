// Can a number be expressed as a sum of two prime numbers
/*There are many theories which express numbers as a sum of two primes like Goldbach’s Conjecture which states that any even number greater than 2 can be expressed as a sum of two primes.
 */
import java.lang.*;
import java.util.*;
public class SumOfTwoPrime {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        int num=scanner.nextInt();
        int flag=0;
        for(int i=2;i<=(num/2);i++){
            if(isPrime(i) && isPrime(num-i)){
                System.out.println(i+" + "+(num-i)+" makes "+num);
                flag=1;
            }
        }
        if(flag==0){
            System.out.println("Can't be expressed as Sum of Two Prime Numbers");
        }
        scanner.close();
    }
    public static boolean isPrime(int num){
        for(int i=2;i<num;i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}

/*
Output :
Enter a Number : 14
3 + 11 makes 14
7 + 7 makes 14
 */
