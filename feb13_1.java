import java.util.Scanner;
class feb13_1{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int numElements = sc.nextInt();
            int[] elements = new int[numElements];
            int sum = 0;

            for (int j = 0; j < numElements; j++) {
                elements[j] = sc.nextInt();
                sum += elements[j];
            }

            int targetValue = sum / numElements;
            int budget = 0;
            boolean possible = true;

            for (int j = 0; j < numElements; j++) {
                if (elements[j] > targetValue) {
                    budget += elements[j] - targetValue;
                } else if (elements[j] < targetValue) {
                    if (budget >= targetValue - elements[j]) {
                        budget -= targetValue - elements[j];
                    } else {
                        possible = false;
                        break;
                    }
                }
            }

            if (possible) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
