import java.util.*;
public class Contest3 {
    public static void main(String[] args) {
            Scanner s=new Scanner(System.in);
            int n=s.nextInt();
            int k=s.nextInt();
            int[] arr=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=s.nextInt();

            }
            int sum=0;
            if(k<n){
                for(int i=0;i<(n-k+1);i++)
                {
                    int sum1=0;
                    for(int j=i;j<(k+i);j++)
                    {
                        sum1=sum1+arr[j];
                    }
                    if(sum1>sum)
                    {
                        sum=sum1;
                    }
                }
                System.out.println(sum);
            }
            else
            {
                System.out.println("-1");
            }

        }

}
