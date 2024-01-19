#include <stdio.h>
#include <stdlib.h>
#include <limits.h>

int find_max_sum_subarray_with_alternating_parities(int* array, int n, int* max_sums) {
    int dp_even[n], dp_odd[n];

    dp_even[0] = array[0];
    dp_odd[0] = 0;

    for (int i = 1; i < n; i++) {
        if (i % 2 == 0) {
            dp_even[i] = max(dp_even[i - 1], dp_odd[i - 1] + array[i]);
            dp_odd[i] = dp_odd[i - 1];
        } else {
            dp_even[i] = dp_even[i - 1];
            dp_odd[i] = max(dp_odd[i - 1], dp_even[i - 1] + array[i]);
        }
    }

    max_sums[i] = max(dp_even[n - 1], dp_odd[n - 1]);
}

int main() {
    int num_test_cases;
    scanf("%d", &num_test_cases);

    int* max_sums = malloc(num_test_cases * sizeof(int));

    for (int i = 0; i < num_test_cases; i++) {
        int array_length;
        scanf("%d", &array_length);

        int* array = malloc(array_length * sizeof(int));

        for (int j = 0; j < array_length; j++) {
            scanf("%d", &array[j]);
        }

        find_max_sum_subarray_with_alternating_parities(array, array_length, max_sums);
        printf("%d\n", max_sums[i]);

        free(array);
    }

    free(max_sums);
    return 0;
}
