import java.util.*;
class encode
{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int ar[]=new int[n];
        for(int x=0;x<n;x++)
        {
            ar[x]=sc.nextInt();
        }
        int t=n;int en[]=new int[n];
        int turn=1;
        while(t>0)
        {
            if(turn%2!=0)
            {
                int max=ar[0];int maxloc=0;
                for(int i=1;i<n;i++)
                {
                    if(ar[i]>=max)
                        max=ar[i];
                        maxloc=i;
                }
                en[maxloc]=1;

            }
            else
            {
                int min=ar[0];int minloc=0;
                for(int i=1;i<n;i++)
                {
                    if(ar[i]<=min&&ar[i]!=0) {
                        min = ar[i];
                        minloc = i;
                    }
                }
                en[minloc]=1;

            }turn++;
            t--;
        }
        for(int x=0;x<n;x++) {
            if (en[x] != 1) {
                en[x] = 0;
            }
        }
        for(int x=0;x<n;x++)
        {
            if(en[x]==0)
                System.out.println(ar[x]);
        }
    }
}
