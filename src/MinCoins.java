import java.util.Scanner;

public class MinCoins {
    static int searchJustSmallest(int []x,int val)
    {
        int l=0;
        int r=x.length-1;
        if(val<x[0])
            return x[0];
        else if(val>x[r])
            return x[r];
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(x[mid]==val)
                return x[mid];
            else if(x[mid]>val&&x[mid-1]<val)
                return x[mid-1];
            else if(x[mid]<val&&x[mid+1]>val)
                return  x[mid];
            else if(x[mid]>val)
                r=mid-1;
            else l=mid+1;
        }
        return 0;
    }
  public static void main(String[] args) {
        int[] changes={ 1, 2, 5, 10, 20, 50, 100, 200, 500, 2000};
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++)
        {
            int val=sc.nextInt();
            while (val>0)
            {
                int dec=searchJustSmallest(changes,val);
                System.out.print(dec+" ");
                val-=dec;
            }
            System.out.println();
        }


    }
}
