//Change the arrangement
import java.util.*;
public class Contest12 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.next();
        }

        for(int i=n-1;i>0;i--)
        {
            String temp=arr[i];
            arr[i]=arr[i-1];
            arr[i-1]=temp;
        }

        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}
