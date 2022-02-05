//Children in an array
import java.util.*;
public class Contest11 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }

        for(int i=0;i<arr.length;i++)

        { int j;
            for( j=i+1;j<arr.length;j++){
                if(arr[i]>=arr[j])
                {break;
                }

            }
            if(j==n)
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
}