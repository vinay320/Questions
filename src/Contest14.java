//Difference and Num
import java.util.*;

public class Contest14 {

    static int solve(int[] arr,int num,int diff)
    {
        int count=0;
        for (int j : arr) {
            if (Math.abs(j - num) <= diff) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        int num=sc.nextInt();
        int diff=sc.nextInt();
        System.out.println(solve(arr,num,diff));
    }
}