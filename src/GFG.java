import java.util.ArrayList;
import java.util.Scanner;

public class GFG {
    static int findlcs(String s1,String s2)
    {
        int n=s1.length();
        int m=s2.length();
        int dp[][]=new int[n+1][m+1];
        int result=0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=m;j++)
            {
                if(i==0||j==0)
                {
                    dp[i][j]=0;
                    continue;
                }
                else if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j]=1+dp[i-1][j-1];
                }
                else dp[i][j]=Math.max(dp[i][j-1],dp[i-1][j]);

                result=Math.max(dp[i][j],result);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int i=1;i<=t;i++)
        {
            String str1,str2;
            str1=sc.next();
            str2=sc.next();
            // System.out.println(str1+str2);
            int x=findlcs(str1,str2);
            System.out.println(str1.length()+str2.length()-x);
        }


    }
}
