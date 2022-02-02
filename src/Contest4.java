//Designation Challenge
import java.util.*;
public class Contest4 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();

        String[] arr=new String[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.next().toUpperCase();
        }
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i].contains("HR"))
            {
                count=count+1;
            }

        }
        if(count>0)
        {
            System.out.println(count);
        }
        else
        {System.out.println("-1");

        }
        for(int i=0;i<n;i++)
        {
            if(arr[i].contains("HR"))
            {
                System.out.println(arr[i]);

            }
        }

    }
}
