import java.io.*;
import java.util.List;
import java.util.Scanner;

public class Import {

    public static void fileImport (List<Contact> contactList, Scanner scan) {

        System.out.print("\nType in the directory of the contactlist you want to import:\n\n");
        String fileName = scan.nextLine();
        //"src/resources/ball.png"
        try {
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            List<Contact> tempContactList = (List) ois.readObject();
            ois.close();
            contactList.addAll(tempContactList);
        } catch (FileNotFoundException e) {
            System.out.println("Can not open file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Can not read data: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Found an unknown object: " + e.getMessage());
        }
        System.out.print("\nContacts have been imported.\n");
    }
}
