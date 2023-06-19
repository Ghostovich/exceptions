package hw2;

import java.util.InputMismatchException;
import java.util.Scanner;

// 1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), 
// и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, 
// вместо этого, необходимо повторно запросить у пользователя ввод данных.

public class t1 {
  public static void main(String[] args) {
    enterFloat();
  }

  private static void enterFloat() {
    System.out.println("Введите дробное число: ");
    Scanner scanner = new Scanner(System.in);
    try {
      float index = scanner.nextInt();
      System.out.println(index);
    } catch (InputMismatchException e) {
      System.err.println("Не число. Попробуйте снова");
      enterFloat();
    }
    scanner.close();
  }

}
