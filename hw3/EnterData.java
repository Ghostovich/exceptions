package hw3;

import java.util.Scanner;

public class EnterData {
  public static String[] enterData() throws Exception {
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Введите следующие данные, разделенные пробелом:\n" +
          "Фамилия Имя Отчество датарождения номертелефона пол\n" +
          "(дату рождения в формате дд.мм.гггг, номер телефона начиная с +7,\n" +
          "пол символом латиницы f - женский, m - мужской): ");
      String data = scanner.nextLine();
      String[] newData = data.split(" ");
      if (newData.length > 6 || newData.length < 6) {
        throw new Exception("Неверное количество данных");
      }
      for (int i = 0; i < newData.length; i++) {
        if (newData[i].isEmpty()) {
          throw new Exception("Отсутствуют данные");
        }
      }

      String lastName = newData[0];
      boolean hasDigits1 = false;
      for (int i = 0; i < lastName.length() && !hasDigits1; i++) {
        if (Character.isDigit(lastName.charAt(i))) {
          hasDigits1 = true;
        }
      }
      if (hasDigits1 = true) {
        throw new Exception("Фамилия содержит цифры");
      }

      String firstName = newData[1];
      boolean hasDigits2 = false;
      for (int i = 0; i < firstName.length() && !hasDigits2; i++) {
        if (Character.isDigit(firstName.charAt(i))) {
          hasDigits2 = true;
        }
      }
      if (hasDigits2 = true) {
        throw new Exception("Имя содержит цифры");
      }

      String surname = newData[2];
      boolean hasDigits3 = false;
      for (int i = 0; i < surname.length() && !hasDigits3; i++) {
        if (Character.isDigit(surname.charAt(i))) {
          hasDigits3 = true;
        }
      }
      if (hasDigits3 = true) {
        throw new Exception("Отчество содержит цифры");
      }
      return newData;
    }
  }
}
