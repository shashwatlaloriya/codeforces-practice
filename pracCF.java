import java.util.*;
class pracNum
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        if(t>0&&t<=270)
        {
            for(int x=0;x<t;x++)
            {
                int a=sc.nextInt();
                int b=sc.nextInt();
                int c=sc.nextInt();
                if((a>=0&&a<=9)||(b>=0&&b<=9)||(c>=0&&c<=9))
                {
                    if(a==b)
                        ans[x]=c;
                    else if(b==c)
                        ans[x]=a;
                    else if(a==c)
                        ans[x]=b;
                }
            }
        }

        for(int i=0;i<t;i++)
            System.out.println(ans[i]);
    }
}
