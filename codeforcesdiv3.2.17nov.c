#include <stdio.h>

int main() {
  int t;
  scanf("%d", &t);

  for (int i = 0; i < t; i++) {
    int n;
    scanf("%d", &n);

    int a[n];
    for (int j = 0; j < n; j++) {
      scanf("%d", &a[j]);
    }

    int dpEven[n + 1], dpOdd[n + 1];
    dpEven[0] = a[0];
    dpOdd[0] = 0;

    for (int j = 1; j <= n; j++) {
      if (j % 2 == 0) {
        dpEven[j] = max(dpEven[j - 1], dpOdd[j - 1] + a[j]);
        dpOdd[j] = dpOdd[j - 1];
      } else {
        dpEven[j] = dpEven[j - 1];
        dpOdd[j] = max(dpOdd[j - 1], dpEven[j - 1] + a[j]);
      }
    }

    int maxSum = max(dpEven[n], dpOdd[n]);
    printf("%d\n", maxSum);
  }

  return 0;
}
