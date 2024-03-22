import java.util.*;
public class encode2
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine();
        int key=0;
        char str[]=s.toCharArray();
        for(int i=1;i<s.length();i+=2) {
            int flag=0;
            for (int x = 0; x < i; x += 2) {
                int ch = (int) str[x];
                ch = ch - 32;
                if (ch == ((int) str[i])) {
                    flag = 1;
                }
                if(flag==1)
                    str[x]='0';

            }
            if(flag==0)
                key++;
        }
        System.out.println(key);
    }
}
