import java.lang.Math;

public class HelloWorld {

   public static int doTaskD(int input) {
      return input * 3;
   }

   public static float doTaskC(int input) {
      float result = 0;
      for (int i = 0; i < 5; i++) {
         result += doTaskD(input)/2;
      }
      return result;
   }

   public static int doTaskB(float value) {
      return (int) Math.ceil(value);
   }

   public static int doTaskA(int input) {
      return doTaskB(doTaskC(input));
   }

   public static void main(String[] args) { 
      System.out.println("Hello, World! \n");
      System.out.println("Result: " + doTaskA(5) + "\n");
   }

}
