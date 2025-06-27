
package Java_class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Categorise {
 public static void saveCatagorise(String catagoriseName) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("catagorise.txt", true))) {
            writer.write(catagoriseName);
            writer.newLine();
        } catch (IOException e) {
        }
    }

      
}
