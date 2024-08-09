// Count Possible Decoding Of A Given Digit Sequence

import java.lang.*;
import java.util.*;
public class CountDecodings {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter a Number : ");
        String num=scanner.nextLine();
        System.out.println("Number of Possible Decodings : "+countDecodings(num));
        scanner.close();
    }
    public static int countDecodings(String num){
        int n = num.length();
        int[] dp = new int[n + 1];
        dp[0] = 1;
        dp[1] = 1;

        for (int i = 2; i <= n; i++) {
            // Check if the current digit is a valid single-digit number
            if (num.charAt(i - 1) != '0') {
                dp[i] = dp[i - 1];
            }

            // Check if the current and previous digit form a valid double-digit number
            if (num.charAt(i - 2) == '1' || (num.charAt(i - 2) == '2' && num.charAt(i - 1) <= '6')) {
                dp[i] += dp[i - 2];
            }
        }

        return dp[n];
    }
}

/*
Output :
Enter a Number : 12122
Number of Possible Decodings : 8
 */
