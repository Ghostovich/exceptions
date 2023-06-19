package hw2;

import java.io.FileNotFoundException;

public class t3 {
  public static void main(String[] args) throws Exception {
    // 3. Дан следующий код, исправьте его там, где требуется
    try {
      int a = 90;
      int b = 3;
      System.out.println(a / b);
      printSum(23, 234);
      int[] abc = { 1, 2, 0, 0};
      abc[3] = 9;
    } catch (NullPointerException ex) {
      System.out.println("Указатель не может указывать на null!");
    } catch (IndexOutOfBoundsException ex) {
      System.out.println("Массив выходит за пределы своего размера!");
    } catch (Throwable ex) {
      System.out.println("Что-то пошло не так...");
    }
  }

  public static void printSum(int a, int b) throws FileNotFoundException {
    System.out.println(a + b);
  }
}
