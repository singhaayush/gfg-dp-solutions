import java.util.Arrays;
import java.util.Scanner;

public class CoinChangeSolutions {
     //*************Recursive Approach**********************
   /* static int count=0;
    static void func(int []arr,int idx,int remainder)
    {
        if(remainder<0)
            return;
        if(remainder==0)
        {
            count++;
            return;
        }
        for(int i=idx;i<arr.length;i++)
        {
            func(arr,i,remainder-arr[i]);
        }
    }*/
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++)
        {
            int n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++)
                arr[i]=sc.nextInt();

            int val=sc.nextInt();
            int dp[]=new int[val+1];
            Arrays.fill(dp,0);
            dp[0]=1;
            for(int i=0;i<arr.length;i++)
            {
                for(int j=arr[i];j<=val;j++)
                {
                    dp[j]+=dp[j-arr[i]];
                }
            }
            System.out.println(dp[val]);
        }
    }


}