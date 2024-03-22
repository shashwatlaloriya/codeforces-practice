import java.util.*;
public class Div4
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        if(t>=1 && t<=32)
        {
            String ans[]= new String[t];
            for(int x=0;x<t;x++)
            {
                String s=sc.nextLine();
                if(s.length()==5)
                {
                    int ac=0,bc=0;
                    for(int y=0;y<s.length();y++)
                    {
                        char ch=s.charAt(y);
                        if(ch=='A')
                            ac++;
                        else if(ch=='B')
                            bc++;
                    }
                    if(ac>bc)
                        ans[x]="A";
                    else
                        ans[x]="B";
                }
            }

            for(int x=0;x<t;x++)
                System.out.println(ans[x]);
        }
    }
}
