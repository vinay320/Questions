import java.util.Scanner;

//Min Deletions
public class Contest5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String a = s.nextLine();
        a=a.toLowerCase();
        int c=0;
        for (int i = 0; i <a.length()-1 ; i++) {
            if(a.charAt(i)=='x')
            {
                if (!(a.charAt(i+1)=='y'))
                {
                    c++;
                }
            }
            if(a.charAt(i)=='y')
            {
                if (!(a.charAt(i+1)=='x'))
                {
                    c++;
                }
            }
        }
        System.out.println(c);
    }
}

