import java.util.*;
public class cf4c
{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String ans[] = new String[n];
        if(n>0&&n<=100000)
        {
            String s[] = new String[n];


            for (int x = 0; x < n; x++)
            {
                s[x]=sc.nextLine();
                if(x==0) {
                    ans[0] = "OK";
                    continue;
                }
                    for(int y=0;y<ans.length;y++)
                {
                    int c =1;int flag=0;
                    if(s[x].equals(ans[x])) {
                        flag=1;
x
                        s[x] += c;
                        c++;
                    }
                    if(flag==1)
                        ans[x]=s[x];
                    else
                        ans[x]="OK";
                }

            }
        }
        for(int z=0;z<n;z++)
            System.out.println(ans[z]);
    }
}
