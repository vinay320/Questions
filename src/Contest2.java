//Java String Reverse
import java.util.*;
public class Contest2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String str=s.nextLine();
        int count=0;
        int l=str.length();
        for(int i=0,j=(l-1);i<l && j>=0;i++,j--)
        {
            if(str.charAt(i)==str.charAt(j))
            {
                count=count+1;
            }
        }
        if(count==str.length())
        {
            System.out.println("Yes");
        }
        else
        {
            System.out.println("No");
        }
    }
}