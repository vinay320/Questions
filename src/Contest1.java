import java.util.*;
public class Contest1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
            int c=0,n1=arr[i];
            while(n1>0)
            {
                n1=n1/10;
                c++;
            }
            if(c%2==0)
            {
                sum++;
            }
        }

        System.out.println(sum);
    }
}
