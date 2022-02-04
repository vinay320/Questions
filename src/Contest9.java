//SS-Array-T46-E
//Given two arrays: arr1[0..m-1] of size m and arr2[0..n-1] of size n.
// Task is to check whether arr2[] is a subset of arr1[] or not.
// Both the arrays can be both unsorted or sorted. It may be assumed that elements in both array are distinct.
import java.util.*;
public class Contest9 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        while(x>0)
        {
            int a1=s.nextInt();
            int a2=s.nextInt();
            int[] arr1=new int[a1];
            int[] arr2=new int[a1];
            for(int i=0;i<a1;i++)
            {
                arr1[i]=s.nextInt();
            }
            for(int i=0;i<a2;i++)
            {
                arr2[i]=s.nextInt();
            }
            int c=0;
            for(int i=0;i<a2;i++)
            {
                for(int j=0;j<a1;j++)
                {
                    if(arr2[i]==arr1[j])
                    {
                        c++;
                    }
                }
            }
            if(c==a2)
            {
                System.out.println("Yes");
            }
            else
            {
                System.out.println("No");
            }
            x--;
        }
    }
}
