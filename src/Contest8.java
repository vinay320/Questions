//Hidden Number(p3)
import java.util.Scanner;
public class Contest8{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int x=s.nextInt();
        int[] arr=new int[x];
        int sum=0;
        for(int i=0;i<x;i++)
        {
            arr[i]=s.nextInt();
            sum=sum+arr[i];
        }
        if(sum%x==0)
        {
            System.out.println(sum/arr.length);
        }
        else{
            System.out.println("-1");
        }
    }
}
