import java.io.Serializable;

public class Address implements Serializable {
    //Properties
    String street;
    String city;
    int zipCode;
    String country;

    //Constructors
    public Address(String street, String city, int zipCode, String country){
        this.street = street;
        this.city = city;
        this.zipCode = zipCode;
        this.country = country;
    }

    //Methodes
    public String getStreet(){
        return this.street;
    }
    public void setStreet(String street){
        this.street = street;
    }
    public String getCity(){
        return this.city;
    }
    public void setCity(String city){
        this.city = city;
    }
    public int getZipCode(){
        return this.zipCode;
    }
    public void setZipCode(int zipCode){
        this.zipCode = zipCode;
    }
    public String getCountry(){
        return this.country;
    }
    public void setCountry(String country){
        this.country = country;
    }
    public void printAddress(){
        System.out.print("\n" + street + "\n" + city + "\n" + zipCode + "\n" + country);
    }
    public void printAddressFormated(){
        System.out.print("\n" + street + "\n" + zipCode + " " + city + "\n" + country);
    }
}
