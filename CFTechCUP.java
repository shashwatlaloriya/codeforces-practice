import java.util.*;
class CFTechCUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String[] s = new String[n];
        String[] t = new String[n];
        for (int x = 0; x < n; x++) {
            s[x] = sc.nextLine();
            if (s[x].length() == 1) {
                t[x] = s[x];
                continue;
            }
           /* for (int y = 0; y < s[x].length(); y++)
            {
                boolean flag = false;
                char ch = s[x].charAt(y);
                for (int z = y + 1; z < n; z++) {
                    char ch1 = s[x].charAt(z);
                    if (ch1 == ch) {
                        String temp=Character.toString(ch);
                        s[x] = s[x].replaceFirst(temp," ");
                        System.out.println(s[x]);
                        t[x] = s[x];
                        break;
                    }
                }
            }*/
            for(int y=0;y<s[x].length();y++)
            {
                int c=0;
                for(int z=y+1;z<s[x].length();z++)
                {
                    if(s[x].charAt(y)==s[x].charAt(z))
                        c++;
                }
                if(c>1)
                {
                    char ch=sc.charAt(y);
                    String temp=Character.toString(ch);
                    s[x] = s[x].replaceFirst(temp,"");
                }
                t[x]=s[x]
            }

        }
        for (int i = 0; i < n; i++)
            System.out.println(t[i]);
    }
}