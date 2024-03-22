import java.util.*;
class QA
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int ans[] = new int[n];
        for (int x = 0; x <= n-1; x++)
        {
            int xval[] = new int[4];
            int yval[] = new int[4];
            for (int y = 0; y <= 3; y++) {
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                xval[y]=n1;
                yval[y]=n2;
            }

            int dist=0;
            for (int z = 1; z < 4; z++)
            {
                if (xval[x] == xval[z])
                {
                    int t1=yval[x];
                    int t2=yval[z];
                    dist = t2 - t1;
                    System.out.println(dist);
                }
            }
            ans[x] = (dist * dist);
            dist=0;

        }
        for(int i=0;i<n;i++)
        {
            System.out.println(ans[i]);
        }

    }
}
