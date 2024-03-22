import java.util.*;

public class DIV3C {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            int k = scanner.nextInt();

            int[] a = new int[n];
            int[] b = new int[m];

            for (int j = 0; j < n; j++) {
                a[j] = scanner.nextInt();
            }
            for (int j = 0; j < m; j++) {
                b[j] = scanner.nextInt();
            }

            boolean canFormK = canFormKFromArrays(a, b, k);
            System.out.println(canFormK ? "YES" : "NO");
        }
    }

    private static boolean canFormKFromArrays(int[] a, int[] b, int k) {
        int requiredNumbers = k / 2;
        Set<Integer> collectedNumbers = new HashSet<>();

        // Collect first k/2 unique numbers from each array
        for (int num : a) {
            if (num <= k && collectedNumbers.size() < requiredNumbers) {
                collectedNumbers.add(num);
            }
        }
        for (int num : b) {
            if (num <= k && collectedNumbers.size() < requiredNumbers) {
                collectedNumbers.add(num);
            }
        }

        // Check if collected numbers form a sequence from 1 to k
        return collectedNumbers.size() == k && new ArrayList<>(collectedNumbers).stream().sorted().allMatch(num -> num == collectedNumbers.size());
    }
}
