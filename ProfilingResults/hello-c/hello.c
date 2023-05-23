#include <stdio.h>
#include <math.h>

int doTaskD(int input) {
   return input * 3;
}

float doTaskC(int input) {
   float result = 0;
   for (int i = 0; i < 5; i++) {
      result += doTaskD(input)/2;
   }
   return result;
}

int doTaskB(float value) {
   return round(value);
}

int doTaskA(int input) {
   return doTaskB(doTaskC(input));
}

int main() {
   printf("Hello, World! \n");
   printf("Result: %d \n", doTaskA(5));
   return 0;
}
