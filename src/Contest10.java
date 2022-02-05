//Calculate Median
import java.util.Arrays;
import java.util.Scanner;
public class Contest10
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n1=s.nextInt();
        int n2=s.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        int l=n1+n2;
        int[] arr3=new int[l];
        for(int i=0;i<n1;i++)
        {
            arr1[i]=s.nextInt();
            arr3[i]=arr1[i];
        }
        for(int i=0;i<n2;i++)
        {
            arr2[i]=s.nextInt();
            arr3[i+n1]=arr2[i];
        }
        Arrays.sort(arr3);
        int sum=0;
        for(int i=0;i<l;i++)
        {
            if(l%2==0)
            {
                sum=(arr3[l/2]+arr3[(l/2)-1])/2;
            }
            else
            {
                sum=arr3[(l/2)];
            }
        }
        System.out.println((double)sum);

    }
}
