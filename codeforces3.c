#include <stdio.h>
#include <math.h>
 
int main() {
  float decimal;
  int numerator, denominator;
 
  scanf("%f", &decimal);
 
 
  numerator = (int)(decimal * 100000000);
  denominator = 100000000;
 
  int gcd = 1;int min;
  if(denominator<numerator)
  min=denominator;
  else
  min=numerator;
  for (int i = 2; i <= min; i++) {
    if (numerator % i == 0 && denominator % i == 0) {
      gcd = i;
    }
  }
 
  
  numerator /= gcd;
  denominator /= gcd;
 
  printf("YES\n");
  printf("%d %d\n",numerator, denominator);
 
  return 0;
}
