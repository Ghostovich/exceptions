package hw2;

import java.util.Scanner;

// 4. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
// Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class t4 {

  public static void main(String[] args) throws Exception {
    enterData();
  }

  private static void enterData() throws Exception {
    System.out.println("Введите данные: ");
    Scanner scanner = new Scanner(System.in);
    String string = scanner.nextLine();
    if (string.isEmpty()) {
      throw new Exception("String can not be empty!");
    } else
      System.out.println(string);
    scanner.close();
  }
}
