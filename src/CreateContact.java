import java.util.List;
import java.util.Scanner;

public class CreateContact {

    public static void createContact (List<Contact> contactList, Scanner scan) {

            String menu = "n";
            System.out.println("\nWhat is your first name?");
            String inputFirstName = scan.nextLine();
            System.out.println("\nWhat is your last name?");
            String inputLastName = scan.nextLine();

            //Check For Double Entries
            for (Contact c : contactList) {
                if (inputFirstName.equals(c.getFirstName()) &&
                        inputLastName.equals(c.getLastName())) {
                    System.out.print("\nThis contact already exits." +
                            "\n\nEdit contact    - Press e" +
                            "\nReturn to menu  - Press m" +
                            "\n\n");
                    menu = scan.nextLine();
                    //Edit Contact
                    if (menu.equals("e")) {
                        System.out.println("\nWhat is your email address?");
                        c.setEmail(scan.nextLine());
                        System.out.println("\nWhat is your phone number?");
                        c.setPhone(scan.nextLine());
                        System.out.println("\nWhat is your address?\nStreet:");
                        c.getAddress().setStreet(scan.nextLine());
                        System.out.println("\nCity:");
                        c.getAddress().setCity(scan.nextLine());
                        System.out.println("\nZipCode:");
                        c.getAddress().setZipCode(scan.nextInt());
                        System.out.println("\nCountry:");
                        scan.nextLine(); //Clear Scanner
                        c.getAddress().setCountry(scan.nextLine());

                        System.out.print("\nContact edited.\n");
                    }
                }
            }
            if (menu.equals("n")){
                System.out.println("\nWhat is your email address?");
                String inputEmail = scan.nextLine();
                System.out.println("\nWhat is your phone number?");
                String inputPhone = scan.nextLine();
                System.out.println("\nWhat is your address?\nStreet:");
                String inputStreet = scan.nextLine();
                System.out.println("\nCity:");
                String inputCity = scan.nextLine();
                System.out.println("\nZipCode:");
                int inputZipCode = scan.nextInt();
                System.out.println("\nCountry:");
                scan.nextLine(); //Clear Scanner
                String inputCountry = scan.nextLine();

                Address inputAddress = new Address(inputStreet, inputCity, inputZipCode, inputCountry);
                Contact inputContact = new Contact(inputFirstName, inputLastName, inputEmail, inputPhone, inputAddress);
                contactList.add(inputContact);

                System.out.print("\nContact created.\n");
            }
    }
}
