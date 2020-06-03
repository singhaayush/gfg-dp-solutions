import java.util.Scanner;

public class KnapSack01 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++)
        {
            int n=sc.nextInt();
            int capacity=sc.nextInt();
            int []val=new int[n];
            int []wt=new int[n];
            for(int i=0;i<n;i++)
            {
                val[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                wt[i]=sc.nextInt();
            }
            int [][]dp=new int[n+1][capacity+1];
            for(int i=0;i<=n;i++)
            {
                for(int j=0;j<=capacity;j++)
                {
                    if(i==0||j==0)
                    {
                        dp[i][j]=0;
                        continue;
                    }
                    else
                    {
                        if(j>=wt[i-1])
                        {
                            dp[i][j]=Math.max(val[i-1]+dp[i-1][j-wt[i-1]],dp[i-1][j]);
                        }
                        else
                        {
                            dp[i][j]=dp[i-1][j];
                        }
                    }

                }
            }
            System.out.println(dp[n][capacity]);
        }
    }
}
