/*import java.util.*;
class div3Mraar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int ans[]=new int[t];
        for(int x=0;x<t;x++)
        {
            int c=0;
            int n=sc.nextInt();
            int ar[]=new int[n];
            int m=sc.nextInt();
            int ar2[]=new int[m];
            int k=sc.nextInt();
            for(int y=0;y<n;y++)
                ar[y]=sc.nextInt();
            for(int y=0;y<m;y++)
                ar2[y]=sc.nextInt();
            for(int y=0;y<n;y++)
            {
                for(int i=0;i<m;i++) {
                    if (ar[y] < k) {
                        if ((ar[y] + ar2[i]) < k)
                            c++;
                    }
                }
            }
            ans[x]=c;
        }

        for(int x=0;x<t;x++)
            System.out.println(ans[x]);
    }
}
*/
import java.util.*;
import java.util.Arrays;

class div3Mraar {

    public static void solveProblem() {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int limit = sc.nextInt();

        int[] arr1 = new int[num1];
        int[] arr2 = new int[num2];

        for (int i = 0; i < num1; i++) {
            arr1[i] = sc.nextInt();
        }

        for (int i = 0; i < num2; i++) {
            arr2[i] = sc.nextInt();
        }

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int result = 0;
        int j = 0;

        for (int i = 0; i < num1; i++) {
            while (j < num2 && arr1[i] + arr2[j] <= limit) {
                result++;
                j++;
            }
        }

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int x = 0; x < t; x++) {
            solveProblem();
        }
    }
}
