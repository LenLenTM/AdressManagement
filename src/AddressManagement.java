import java.io.*;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressManagement {

    public static void main(String[] args) {

        AddressManagement m = new AddressManagement();
        m.runAddressManagement();
    }

    public List<Contact> contactList = new ArrayList<>();
    public String menu = "m";
    public Scanner scan = new Scanner(System.in);

    public void runAddressManagement() {

        //Read Contact File
        try {
            FileInputStream fis = new FileInputStream("contacts.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            contactList = (List) ois.readObject();
            ois.close();
        } catch (FileNotFoundException e) {
            System.out.println("Can not open file: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Can not read data: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println("Found an unknown object: " + e.getMessage());
        }

        //Menu
        while (!menu.equals("x")){
            System.out.print("\nM E N U" +
                    "\n" +
                    "\nCreate contact         - Press n" +
                    "\nEdit contact           - Press e" +
                    "\nSearch contact         - Press s" +
                    "\nPrint contacts         - Press p" +
                    "\nDelete contact         - Press d" +
                    "\nImport contact-list    - Press i" +
                    "\nExport to text         - Press t" +
                    "\nSave & exit program    - Press x" +
                    "\n\n");
            menu = scan.nextLine();

            //Create Contacts
            if (menu.equals("n")) {
                CreateContact.createContact(contactList, scan);
            }
            //Print Contact List
            if (menu.equals("p")) {
                Print.print(contactList, scan);
            }
            //Delete Contact
            if (menu.equals("d")) {
                Delete.deleteContact(contactList, scan);
            }
            //Edit Contact
            if (menu.equals("e")) {
                EditContact.editContact(contactList, scan);
            }
            //Search For Contact
            if (menu.equals("s")) {
                Search.search(contactList, scan);
            }
            //Import Contact List
            if (menu.equals("i")) {
                Import.fileImport(contactList, scan);
            }
            //Export Contacts As Text
            if (menu.equals("t")) {
                TextExport.textExport(contactList, scan);
            }
        }
        //Save Contacts To Contact File
        Save.save(contactList);
    }
}
