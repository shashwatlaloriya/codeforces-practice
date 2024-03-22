import java.util.*;
public class R992A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        // Optimize array size if possible
        int maxAnswers = Math.min(t, 10000); // Assuming a maximum of 10000 answers
        int[] ans = new int[maxAnswers];

        for (int x = 0; x < t && x < maxAnswers; x++) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Simplified logic without unused array
            int temp = m / 2;
            int c = m / 2; // Directly calculate c
            ans[x] = n * c;
        }

        for (int i = 0; i < maxAnswers; i++) {
            System.out.println(ans[i]);
        }
    }
}

/*import java.util.*;
class R992A
{
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        if(t>0&&t<=10000)
        {
             for(int x=0;x<t;x++)
             {
                 int n=sc.nextInt();
                 int m=sc.nextInt();
                 if(n<2||m>10000)
                     break;
                 else
                 {
                     int ar[][]=new int[n][m];
                     int temp=m/2;
                     int c=0;
                     for(int y=1;y<m;y++)
                     {
                         if(y<m)
                         {
                             y++;
                             c++;

                         }
                     }
                     if(c>=temp)
                         ans[x]=n*c;
                 }
             }
        }
        for(int i=0;i<t;i++)
        {
            System.out.println(ans[i]);
        }
    }
}
*/
