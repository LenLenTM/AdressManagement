import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class EditContact {

    public static void editContact (List<Contact> contactList, Scanner scan) {
        System.out.print("\nEnter index-number of contact you would like to edit\n");
        int edit = scan.nextInt() - 1;
        scan.nextLine(); //Clear Scanner
        System.out.print("Nr." + (edit + 1) + "\n");
        contactList.get(edit).printContact();
        System.out.print("\n");
        System.out.print("\nSet a new firstname\n");
        contactList.get(edit).setFirstName(scan.nextLine());
        System.out.print("\nSet a new lastname\n");
        contactList.get(edit).setLastName(scan.nextLine());
        System.out.print("\nSet a new mail address\n");
        contactList.get(edit).setEmail(scan.nextLine());
        System.out.print("\nSet a new phone number\n");
        contactList.get(edit).setPhone(scan.nextLine());
        System.out.print("\nSet a new street\n");
        contactList.get(edit).getAddress().setStreet(scan.nextLine());
        System.out.print("\nSet a new city\n");
        contactList.get(edit).getAddress().setCity(scan.nextLine());
        System.out.print("\nSet a new zip code\n");
        contactList.get(edit).getAddress().setZipCode(scan.nextInt());
        System.out.print("\nSet a new country\n");
        scan.nextLine(); //Clear Scanner
        contactList.get(edit).getAddress().setCountry(scan.nextLine());
        System.out.print("\nContact edited.\n");
    }
}
