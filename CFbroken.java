import java.util.*;
class CFbroken
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        String  ans[]=new String[n];
        for(int x=0;x<n;x++)
        {
            s[x]=sc.nextLine();
            int l=s[x].length();
            char[] temp;
            temp = new char[l];
            if((l == 1) && (s[x].charAt(0) == 'b' || (s[x].charAt(0) == 'B')))
            {
                ans[x]="";continue;
            }
            temp[0]=s[x].charAt(0);
            int c=0;
            for(int y=1;y<l;y++)
            {
                char ch=s[x].charAt(y);

                if(ch=='b')
                {
                    String sub=s[x].substring(0,y);
                    for(int z=sub.length()-1;z>=0;z--) {
                        if (Character.isLowerCase(s[x].charAt(z))) {
                            temp[z] = ' ';
                            break;
                        }
                    }
                }
                else if(ch=='B')
                {
                    String sub=s[x].substring(0,y);
                    for(int z=sub.length()-1;z>=0;z--) {
                        if (Character.isUpperCase(s[x].charAt(z))) {
                            temp[z] =' ';
                            break;
                        }
                    }
                }
                else{
                    c++;
                    temp[c]=ch;
                }

            }
            String str = new String();
            String boom=str.valueOf(temp);
            boom.trim();
            ans[x]=boom;
        }
        for(int i=0;i<n;i++)
            System.out.println(ans[i]);
    }
}
