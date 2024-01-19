#include <stdio.h>
#include <math.h>

int main() {
  float decimal;
  int numerator, denominator;

  printf("Enter a decimal number: ");
  scanf("%f", &decimal);

  // Convert the decimal to a fraction with a denominator of 10000.
  numerator = (int)(decimal * 10000);
  denominator = 10000;

  // Find the greatest common divisor of the numerator and denominator.
  int gcd = 1;
  for (int i = 2; i <= min(numerator, denominator); i++) {
    if (numerator % i == 0 && denominator % i == 0) {
      gcd = i;
    }
  }

  // Simplify the fraction by dividing the numerator and denominator by the gcd.
  numerator /= gcd;
  denominator /= gcd;

  // Print the fraction in its simplified form.
  printf("The fraction form of %f is %d/%d\n", decimal, numerator, denominator);

  return 0;
}
