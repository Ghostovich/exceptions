package hw2;

public class t2 {
  public static void main(String[] args) {

    // 2. Если необходимо, исправьте данный код

    try {
      int d = 1;
      int[] intArray = new int[8];
      double catchedRes1 = intArray[0] / d;
      System.out.println("catchedRes1 = " + catchedRes1);
    } catch (ArithmeticException e) {
      System.out.println("Catching exception: " + e);
    }

  }

}
