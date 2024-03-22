import java.util.*;
class Feb13
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        if(t>0&&t<=100) {
            String ans[] = new String[t];
            char ch[] = new char[26];
            char temp = 'a';
            for (int x = 0; x < 26; x++)
                ch[x] = temp++;
            for (int x = 0; x < t; x++) {
                int n = sc.nextInt();
                if (n > 2 && n <= 78) {
                    if (n <= 28) {
                        String s = "aa";
                        char c = ch[n - 2 - 1];
                        s += c;
                        ans[x] = s;
                    } else if (n <= 53) {
                        String s = "a";
                        char c1 = ch[(n - 1) - 26 - 1];
                        s += c1;
                        s += "z";
                        ans[x] = s;
                    } else {
                        String s = "zz";
                        char c2 = ch[n - 53];
                        s = c2 + s;
                        ans[x] = s;
                    }
                }
            }


            for (int i = 0; i < t; i++)
                System.out.println(ans[i]);
        }
    }
}
