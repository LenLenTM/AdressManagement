import java.io.Serializable;

public class Contact implements Serializable {

    //Properties
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Address address;

    //Constructors
    public Contact(String firstName, String lastName, String email, String phone, Address address){
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
        this.address = address;
    }

    //Getter & Setter Methods
    public String getFirstName(){
        return this.firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return this.lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public String getEmail(){
        return this.email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone = phone;
    }
    public Address getAddress(){
        return this.address;
    }
    public void setAdress(String street, String city, int zipCode, String country){
        this.address = address;
    }
    public void printContact(){
        System.out.print(firstName + "\n" + lastName + "\n" + email + "\n" + phone);
    }
    public void printContactAndAddress(){
        System.out.print(firstName + " "+ lastName + "\n" + email + "\n" + phone);
        this.address.printAddressFormated();
    }
}
