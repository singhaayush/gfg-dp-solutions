import java.util.Scanner;

public class LongestCommonSubString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++)
        {
            int m,n;
            m=sc.nextInt();
            n=sc.nextInt();

            String str1=sc.next();
            String str2=sc.next();

           int dp[][]=new int[m+1][n+1];
            int result=Integer.MIN_VALUE;
            for(int i=0;i<=m;i++)
            {
                for(int j=0;j<=n;j++)
                {
                    if(i==0||j==0)
                    {
                        dp[i][j]=0;
                        continue;
                    }
                    else {
                        if(str1.charAt(i-1)==str2.charAt(j-1))
                        {
                            dp[i][j]=1+dp[i-1][j-1];
                        }
                        else
                        {
                            dp[i][j]=0;
                        }
                    }
                    result=Math.max(result,dp[i][j]);
                }
            }
            System.out.println(result);
        }
    }
}
