import java.util.*;
public class CF20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String[] s=new String[n];
        boolean flag=true;
        int l=0;
        String[] t = new String[n];
        for(int x=0;x<n;x++)
        {
            s[x]=sc.nextLine();
            if(s[x].length()==1){
                t[x]=s[x];continue;}
            for(int i=0;i<s[x].length();i++)
            {
                if (flag == true)
                     l = s[x].length() / 2;
                if(l==1)
                {
                    char one=s[x].charAt(0);char two=s[x].charAt(1);
                    if(one==two)
                    {
                        String temp1=""+one;
                        s[x]=s[x].replaceFirst(temp1, "");
                        s[x].trim();
                        System.out.println(s[x]);
                        t[x]=s[x];
                        continue;
                    }
                }
                String sub = s[x].substring(0, l );
                String sub1 = "";
                for (int y = l; y < s[x].length(); y++) {
                    char ch = s[x].charAt(y);
                    sub1 += ch;
                }
                if (sub1.contains(sub))
                {
                    s[x]=s[x].replaceFirst(sub, "");
                    flag=true;
                    s[x].trim();
                    System.out.println(s[x]);
                    t[x]=s[x];
                }
                /*if (sub1.contains(sub)) {
                    int len = sub.length();
                    char[] temp = s[x].toCharArray();
                    String tm="";

                    //for (int z = 0; z < len; z++){
                     //   temp[z]=te,m.replace("a", "");
                    //}
                    for (int o = 0; o < len; o++)
                        tm+=temp[o];
                    s[x]=tm;
                    s[x].trim();
                    t[x]=s[x];
                    flag = true;
                }*/ else {
                    flag = false;
                    l--;
                }
            }
            }
        for (int j = 0; j < n; j++) {
            System.out.println(t[j]);
        }
        }
    }
