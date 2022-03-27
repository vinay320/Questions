//Password Checker 10
import java.util.*;
public class Contest15 {
        static int solve(String str, int n)
        {
            int nu=0;
            int cp=0;
            int chh=0;

            for(int i=0;i<n;i++)
            {
                if(str.charAt(i)<='9' && str.charAt(i)>='0')
                {
                    nu++;
                }
                if(str.charAt(i)>=65 && str.charAt(i)<=90)
                {
                    cp++;
                }
                if(str.charAt(i)==' ' || str.charAt(i)=='/')
                {
                    chh++;
                }

            }

            if(n<4)
            {
                return 0;
            }
            else if(str.charAt(0)>='0' && str.charAt(0)<='9')
            {
                return 0;
            }
            else if(cp<0 || nu<0 || chh>0)
            {
                return 0;
            }
            return 1;

        }
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String str=sc.nextLine();
            int n=str.length();
            System.out.println(solve(str,n));
        }

}
