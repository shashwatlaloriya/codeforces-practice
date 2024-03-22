import java.util.*;
public class CFiq
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n>2&&n<=100)
        {
            int ar[] = new int[n];
            for(int y=0;y<n;y++) {
                ar[y]=sc.nextInt();
            }
            for (int x = 0; x < n; x++)
            {
                boolean xeven,x1even,x2even;
                if(ar[x]%2==0)
                    xeven=true;
                else
                    xeven=false;
                if(ar[x+1]%2==0)
                    x1even=true;
                else
                    x1even=false;
                if(ar[x+2]%2==0)
                    x2even=true;
                else
                    x2even=false;
                if(xeven==x1even)
                {
                    if (xeven!=x2even) {
                        System.out.println((x+2)+1);
                        break;
                    }
                }
                else if(x1even==x2even)
                {
                    System.out.println(x + 1);
                    break;
                }
                else
                {
                    System.out.println(x + 2);
                    break;
                }
            }
        }
    }
}
