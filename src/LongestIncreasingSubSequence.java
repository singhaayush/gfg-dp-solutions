import java.util.Arrays;
import java.util.Scanner;

public class LongestIncreasingSubSequence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int z=1;z<=t;z++)
        {
            int n=sc.nextInt();
            int[]arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
           int length=1;
            int lArr[]=new int[n];
            Arrays.fill(lArr,1);
            for(int i=0;i<n;i++)
            {

                for(int j=i-1;j>=0;j--)
                {
                    if(arr[i]>arr[j])
                    {
                        lArr[i]=Math.max(lArr[i],lArr[j]+1);

                    }
                }
                length=Math.max(length,lArr[i]);
            }
            System.out.println(length);

        }
    }
}
