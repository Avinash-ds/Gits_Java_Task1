package propertiesfile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadAndWrite {
    public static void main(String[] args) {
        // Path to the properties file
        String filePath = "config.properties";

        // Read properties from the file
        Properties properties = new Properties();
        try (FileInputStream fileInputStream = new FileInputStream(filePath)) {
            properties.load(fileInputStream);
            System.out.println("Reading properties from the file:");
            System.out.println("Username: " + properties.getProperty("username"));
            System.out.println("Password: " + properties.getProperty("password"));
        } catch (IOException e) {
            System.err.println("Error reading properties: " + e.getMessage());
        }

        // Modify and write properties back to the file
        try (FileOutputStream fileOutputStream = new FileOutputStream(filePath)) {
            // Update or add properties
            properties.setProperty("username", "newUsername");
            properties.setProperty("password", "newPassword");

            // Save the properties to the file
            properties.store(fileOutputStream, "Updated properties");
            System.out.println("Properties updated and written to the file.");
        } catch (IOException e) {
            System.err.println("Error writing properties: " + e.getMessage());
        }
    }
}
