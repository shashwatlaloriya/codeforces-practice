import java.util.*;
public class ICPC
{
        public static void main(String[] args)
        {
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            sc.nextLine();
            String s=sc.nextLine();
            if(s.length()!=n)
                System.out.println("-1");
            else
            {
                int ans=0;
                for(int x=1;x<n;x++)
                {
                    String str=s.substring(x,n);
                    String test="";
                    int l1=0,o1=0,l2=0,o2=0;
                    for(int y=0;y<x;y++)
                    {
                        char ch=s.charAt(y);
                        if(ch=='L')
                            l1++;
                        else
                            o1++;
                        test=test+ch;
                    }
                    for(int z=0;z<str.length();z++)
                    {
                        char ch1=str.charAt(z);
                        if(ch1=='L')
                            l2++;
                        else
                            o2++;
                    }
                    if(l1!=l2&&o1!=o2) {
                        ans=x;
                        break;
                    }
                }
                if(ans!=0)
                {
                    System.out.println(ans);
                }
                else
                    System.out.println("-1");
            }
        }
}
