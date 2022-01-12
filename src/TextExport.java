import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Scanner;

public class TextExport {

    public static void textExport (List<Contact> contactList, Scanner scan) {

        System.out.print("\nFilename:\n\n");
        String fileName = scan.nextLine() + ".txt";
        try {
            FileWriter writer = new FileWriter(fileName);
            int index = 1;
            for (Contact c : contactList) {
                writer.write("Nr." + index + "\n");
                writer.write(c.getFirstName() + " " + c.getLastName() + "\n");
                writer.write(c.getEmail() + "\n");
                writer.write(c.getPhone() + "\n");
                writer.write(c.getAddress().getStreet() + "\n");
                writer.write(c.getAddress().getZipCode() + " " + c.getAddress().getCity() + "\n");
                writer.write(c.getAddress().getCountry() + "\n\n");
                index ++;
            }
            writer.close();
        } catch (IOException ex) {
            System.out.println("Datei kann nicht geöffnet werden: " + ex.getMessage());
        }
        System.out.print("\nFile has been created.\n");
    }
}
