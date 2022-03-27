//Rat Count House
import java.util.*;

public class Contest13 {
    static int rat(int r,int unit,int[] arr)
    {
        int count=0;
        int sum=0;
        if(arr==null)
        {
            return -1;
        }
        else{
            for (int j : arr) {
                sum = sum + j;
                count++;
                if (sum >= (unit * r)) {
                    break;
                }
            }
            if(sum<unit*r)
            {
                return 0;
            }

        }
        return count;


    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int unit=sc.nextInt();
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.println(rat(r,unit,arr));


    }
}