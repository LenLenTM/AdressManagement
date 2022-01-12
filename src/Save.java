import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class Save {

    public static void save (List<Contact> contactList) {
        try {
            FileOutputStream fos = new FileOutputStream("contacts.dat", false);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(contactList);
            oos.close();
        } catch (
                FileNotFoundException e) {
            System.out.println("Can not open file!");
        } catch (
                IOException e) {
            System.out.println("Can not write data: " + e.getMessage());
        }
    }
}
