package hw3;

import java.io.FileWriter;
import java.io.IOException;

public class WriteToFile {

  public static void writeToFile(String[] data) throws IOException {

    try (FileWriter fileWriter = new FileWriter("./hw3/example.txt", true)) {
      for (String elem : data) {
        fileWriter.append("<" + elem + ">");
        fileWriter.flush();
      }
      fileWriter.append("\n");
    } catch (Exception e) {
      System.err.println("Ошибка записи");
    }

  }

}
