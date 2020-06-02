import java.util.Arrays;
import java.util.Scanner;

public class MinimumOperations {


      public static void main (String[] args) {
         //code
         Scanner sc=new Scanner(System.in);
         int t=sc.nextInt();

         for(int k=1;k<=t;k++)
         {
            int n=sc.nextInt();
            int arr[]=new int[n+1];
            Arrays.fill(arr,0);
            arr[0]=1;
            arr[1]=1;
            for(int i=2;i<=n;i++)
            {
               if(i%2!=0)
                  arr[i]=arr[i-1]+1;
               else
                  arr[i]=1+Math.min(arr[i-1],arr[i/2]);
            }
            System.out.println(arr[n]);
         }

      }
   }
