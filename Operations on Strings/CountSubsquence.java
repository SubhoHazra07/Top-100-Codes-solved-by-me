import java.util.*;
public class CountSubsquence {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter First String : ");
        String str1=scanner.nextLine();
        System.out.print("Enter Second String : ");
        String str2=scanner.nextLine();
        System.out.println("Common Subsequence Count : "+commonSubsequnce(str1,str2));
        scanner.close();
    }
    public static int commonSubsequnce(String s1,String s2){
        int n1=s1.length();
        int n2=s2.length();
        int dp[][]=new int[n1+1][n2+1];
        char ch1,ch2;
        for(int i=0;i<=n1;i++){
            for(int j=0;j<=n2;j++){
                dp[i][j]=0;
            }
        }
        for(int i=1;i<=n1;i++){
            for(int j=1;j<=n2;j++){
                ch1=s1.charAt(i-1);
                ch2=s2.charAt(j-1);
                if(ch1==ch2){
                    dp[i][j]=1+dp[i][j-1]+dp[i-1][j];
                }else{
                    dp[i][j]=dp[i][j-1]+dp[i-1][j]-dp[i-1][j-1];
                }
            }
        }
        return dp[n1][n2];
    }
}

/*
Output :
Enter First String : subho
Enter Second String : shweta
Common Subsequence Count : 3
 */