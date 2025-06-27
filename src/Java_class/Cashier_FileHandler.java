
package Java_class;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class Cashier_FileHandler {
     private static final String CASHIER_FILE = "cashier_details.txt";

    public static void addCashier(String CashierName, String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(CASHIER_FILE, true))) {
            writer.write("Cashier Name: " + CashierName + "\n");
            writer.write("Username: " + username + "\n");
            writer.write("Password: " + password + "\n");
            writer.write("------------\n");
            writer.flush();
        } catch (IOException e) {
        }
    }

    
}
