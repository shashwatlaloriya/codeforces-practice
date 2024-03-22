/*import java.util.*;
public class Div42
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        if (t >= 1 && t <= 10000) {
            int ans[] = new int [t];
            for(int x=0;x<t;x++)
            {
                int n=sc.nextInt();
                int ar[]=new int[n];
                for(int y=1;y<=n;y++)
                {
                    ar[y-1]=y;
                    System.out.println(ar[y-1]);
                }

                for(int y=0;y<n;y++) {
                    if (ar[y] > 9) {
                        int temp=ar[y];
                        int sum=0;
                        while (temp > 0) {
                            int digit = temp % 10;
                            sum = sum + digit;
                            temp = temp / 10;
                        }
                        ar[y]=sum;
                    }
                }
                int sum=0;
                for(int y=0;y<n;y++)
                {
                    sum+=ar[y];
                }
                }

                for(int x=0;x<t;x++)
                    System.out.println(ans[x]);
            }
    }
}
        import java.util.*;

public class Div42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        if (t >= 1 && t <= 10000) {
            int ans[] = new int[t];
            for (int x = 0; x < t; x++) {
                int n = sc.nextInt();
                int ar[] = new int[n];
                for (int y = 1; y <= n; y++) {
                    ar[y - 1] = y;
                }

                for (int y = 0; y < n; y++) {
                    if (ar[y] > 9) {
                        int temp = ar[y];
                        int sum = 0;
                        while (temp > 0) {
                            int digit = temp % 10;
                            sum = sum + digit;
                            temp = temp / 10;
                        }
                        ar[y] = sum;
                    }
                }

                int sum = 0;
                for (int y = 0; y < n; y++) {
                    sum += ar[y];
                }

                ans[x] = sum;
            }

            for (int x = 0; x < t; x++)
                System.out.println(ans[x]);
        }
    }
}

import java.util.*;

public class Div42 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        if (t >= 1 && t <= 10000) {
            int ans[] = new int[t];
            for (int x = 0; x < t; x++) {
                int n = sc.nextInt();
                int sum = 0;

                for (int y = 1; y <= n; y++) {
                    int temp = y;
                    while (temp > 0) {
                        sum += temp % 10;
                        temp /= 10;
                    }
                }

                ans[x] = sum % 10;
            }

            for (int x = 0; x < t; x++)
                System.out.println(ans[x]);
        }
    }
}
*/
//package CoreJava;
import java.util.*;
public class Div42{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t > 0) {

            int n = sc.nextInt();
            int arr[][] =new int[n][n];

            List<String> li = new ArrayList<>();

            for(int i=0;i<n;i++) {
                li.add(sc.next());
            }

            for(int i=0;i<li.size();i++) {

                String s = li.get(i);
                for(int j=0;j<n;j++) {
                    char c= s.charAt(j);
                    if(c=='1') {
                        arr[i][j] = 1;
                    }else {
                        arr[i][j] = 0;
                    }
                }
            }


            int tringle = 0;
            for(int i=0;i<n;i++) {

                for(int j=1;j<n-1;j++) {

                    if(arr[i][j]==1) {
                        if(arr[i][j-1]==0 && arr[i][j+1]==0) {

                            tringle = 1;
                            break;
                        }
                    }
                }
            }
            if(tringle==1) {
                System.out.println("TRIANGLE");
            }else {
                System.out.println("SQUARE");
            }

            t--;
        }


    }
}

