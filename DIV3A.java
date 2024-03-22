import java.util.Scanner;

class MinSegmentLength {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = scanner.nextInt();

        for (int i = 0; i < testCases; i++) {
            int stripLength = scanner.nextInt();
            String strip = scanner.next();  // Read entire line using next()

            int minSegmentLength = calculateMinSegmentLength(strip);
            System.out.println(minSegmentLength);
        }
    }

    private static int calculateMinSegmentLength(String strip) {
        int firstBIndex = strip.indexOf('B');
        int lastBIndex = strip.lastIndexOf('B');

        if (firstBIndex == -1) {
            return 1;  // No 'B' characters found
        }

        // Directly calculate segment length using subtraction
        // and add 1 to include both 'B' characters
        return lastBIndex - firstBIndex + 1;
    }
}