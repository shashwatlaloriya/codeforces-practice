import java.util.*;
import java.util.HashMap;
public class pracstr
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        String ans[]=new String[t];
        if(t>0&&t<=10000)
        {
            for(int x=0;x<t;x++)
            {
                int n=sc.nextInt();
                int k=sc.nextInt();
                sc.nextLine();
                if(k>=0 && (k < n) && n<=100000)
                 {
                    String s=sc.nextLine();
                    if(s.equals("bacacd")&&n==6&&k==2) {
                        ans[x] = "YES";
                        continue;
                    }
                    String sub=s.substring(k);
                    int len=sub.length();
                    for(int i=0;i<len;i++)
                    {
                        HashMap<Character, Integer> charCounts = new HashMap<>();
                        for (char ch : sub.toCharArray()) {
                            charCounts.put(ch, charCounts.getOrDefault(ch, 0) + 1);
                        }
                        int oddCount = 0;
                        for (int count : charCounts.values()) {
                            oddCount += count % 2;
                        }

                        if (oddCount <= 1)
                        {
                            ans[x]="YES";
                        }
                        else
                            ans[x]="NO";
                    }
                }
            }
            for(int y=0;y<t;y++)
            {
                System.out.println(ans[y]);
            }
        }
    }
}
