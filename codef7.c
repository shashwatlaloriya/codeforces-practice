#include <stdio.h>
#include <stdlib.h>

int main() {
    int t;
    scanf("%d", &t);

    int pairs[t];

    for (int i = 0; i < t; i++) {
        int n;
        scanf("%d", &n);

        int notes[n];
        for (int j = 0; j < n; j++) {
            scanf("%d", &notes[j]);
        }

        int pairsCount = 0;
        for (int j = 0; j < n; j++) {
            for (int k = j + 1; k < n; k++) {
                if (notes[j] < notes[k] && notes[j] * notes[k] == notes[k] * notes[j]) {
                    pairs[i] = pairsCount++;
                }
            }
        }
    }

    for (int i = 0; i < t; i++) {
        printf(" %d\n", pairs[i]);
    }

    return 0;
}
