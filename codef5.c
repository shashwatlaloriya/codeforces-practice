#include <stdio.h>
#include <stdlib.h>
int main() {
    int numTestCases;
    scanf("%d", &numTestCases);
    int n[numTestCases];

    for (int testCase = 1; testCase <= numTestCases; testCase++) {
        int numBoxes;
        scanf("%d", &numBoxes);

        int weights[numBoxes];
        for (int i = 0; i < numBoxes; i++) {
            scanf("%d", &weights[i]);
        }
	int c=0;
        int maxWeight = weights[0];
        int minWeight = weights[0];

        for (int i = 1; i < numBoxes; i++) {
            if (weights[i] > maxWeight) {
                maxWeight = weights[i];
            } else if (weights[i] < minWeight) {
                minWeight = weights[i];
            }
        }

        n[c] = maxWeight - minWeight;
        c++;
        
    }
    for(int x=0;x<numTestCases;x++)
    printf("%d\n",n[x]);

    return 0;
}
