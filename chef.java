import java.util.*;
import java.lang.*;
import java.io.*;

class chef
{
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        if(t>0&&t<=100)
        {
            for(int x=0;x<t;x++)
            {
                int n=sc.nextInt();
                int ar[]=new int[n];
                if(n>0&&n<=100)
                {
                    int k=sc.nextInt();
                    int c=0;
                    int flag=0;
                    for(int y=0;y<n;y++)
                    {
                        ar[y]=sc.nextInt();
                    }
                    for(int j=0;j<n;j++)
                    {
                        if(ar[j]>=k)
                            flag=1;
                    }
                    if(flag==0)
                    {
                        ans[x]=-1;
                        continue;
                    }

                    c=ar[0]%k;
                    for(int z=1;z<n-1;z++)
                    {
                        if(c>=ar[z+1]%k)
                            c=ar[z+1]%k;

                    }

                    ans[x]=c;
                }
            }

            for(int i=0;i<t;i++)
                System.out.println(ans[i]);
        }

    }
}
