import java.util.*;
class feb13_2
{
        public static int countFreq(ArrayList<Integer>ar, int n)
        {
            int big=0;
            boolean visited[] = new boolean[n];
            Arrays.fill(visited, false);
            for (int i = 0; i < n; i++) {
                if (visited[i] == true)
                    continue;
                int count = 1;
                for (int j = i + 1; j < n; j++) {
                    if (ar.get(i) == ar.get(j)) {
                        visited[j] = true;
                        count++;
                    }
                    if(count ==n)
                        return 1000000;
                }
                if(big<=count)
               big=ar.get(i);
            }
            return big;
        }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int ans[] = new int[t];
        if (t > 0 && t <= 10000) {
            for (int x = 0; x < t; x++) {
                int n = sc.nextInt();
                ArrayList<Integer> ar = new ArrayList<Integer>(n);
                for (int z = 0; z < n; z++)
                    ar.add(sc.nextInt());
                if (n == 1) {
                    ans[x] = 0;
                    continue;
                }
                if (n == 2) {
                    ans[x] = 1;
                    continue;
                }
                int temp=countFreq(ar,n);
                if(1000000==temp)
                    ans[x]=0;
                else {
                    int indl = 0, ind1 = 0;
                    for (int f = 0; f < n; f++) {
                        if (ar.get(f) != ar.get(f + 1)) {
                            ind1 = f + 1;
                            break;
                        }
                    }
                    indl = ar.lastIndexOf(temp);

                    if (indl < n - 1) {
                        int c = (n - ind1) - 1;
                        int var = (indl - ind1+1);
                        ans[x]= var*c;
                    }
                    else
                    {
                        while(ar.get(indl-1)==ar.get(indl))
                        {
                            indl--;
                        }
                        int c=indl-ind1;
                        ans[x]=c;
                    }
                }
            }
        }
        for(int x=0;x<t;x++)
            System.out.println(ans[x]);
    }
}
