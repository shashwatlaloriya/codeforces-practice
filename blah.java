/*#include <bits/stdc++.h>
        using namespace std;
        using ll = long long;
        constexpr int inf = 1e9 + 9;
        constexpr ll infll = 1e18;
        constexpr int maxn = 2e5 + 9;
        int numb[maxn];
        void solve() {
        int n;
        cin >> n;
        queue<int> q;
        for (int i = 0; i < n; i++) {
        cin >> numb[i];
        }
        sort(numb, numb + n);
        int pref = -1;
        int cnt = 0;
        int out = 0;
        for (int i = 0; i < n; i++) {
        while (!q.empty() && numb[i] - q.front() >= n) {
        q.pop();
        cnt--;
        }
        if (pref != numb[i]) {
        q.push(numb[i]);
        cnt++;
        }
        out = max(out, cnt);
        pref = numb[i];
        }
        cout << out << "\n";
        return;
        }
        int main() {
        int t;
        cin >> t;
        while (t--) {
        solve();
        }
        return 0;
        }*/
import java.util.*;

public class blah{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();

        for (int t = 0; t < testCases; t++) {
            int n = scanner.nextInt();
            int[] nums = new int[n];

            for (int i = 0; i < n; i++) {
                nums[i] = scanner.nextInt();
            }

            System.out.println(maxLengthSubarray(nums));
        }

        scanner.close();
    }

    static int maxLengthSubarray(int[] nums) {
        Arrays.sort(nums);
        Queue<Integer> queue = new LinkedList<>();
        int maxLength = 0;
        int prev = -1;

        for (int num : nums) {
            while (!queue.isEmpty() && num - queue.peek() >= nums.length) {
                queue.poll();
            }
            if (num != prev) {
                queue.add(num);
            }
            maxLength = Math.max(maxLength, queue.size());
            prev = num;
        }

        return maxLength;
    }
}
