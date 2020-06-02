import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class MaxChainLength {
    static class Interval
    {
        private int startTime;
        private int endTime;

        public Interval(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

    }
    static class sortIntervalByEndTime implements Comparator<Interval>
    {
        @Override
        public int compare(Interval o1, Interval o2) {
         return o1.endTime-o2.endTime;
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++)
        {
            int n=sc.nextInt();
            Interval intervals[]=new Interval[n];
            for(int i=0;i<n;i++)
            {
                int st=sc.nextInt();
                int et=sc.nextInt();
                intervals[i]=new Interval(st,et);
            }
            Arrays.sort(intervals,new sortIntervalByEndTime());
            int count=1;
            int back=0;
            for(int i=1;i<n;i++)
            {
                if(intervals[i].startTime>intervals[back].endTime)
                {
                    count++;
                    back=i;
                }
            }
            System.out.println(count);
        }
    }
}
