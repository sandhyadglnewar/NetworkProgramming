// Class to represent an Address
class Address {
    String type;
    String street;
    String city;
    String state;
    String zipCode;

    // Constructor to initialize all fields
    Address(String type, String street, String city, String state, String zipCode) {
        this.type = type;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }

    // Method to display the address details
    void displayAddress() {
        System.out.println(type + " Address:");
        System.out.println(street);
        System.out.println(city + ", " + state + " " + zipCode);
        System.out.println();
    }
}

// Main class with main method
public class Main {
    public static void main(String[] args) {
        // Create different Address objects
        Address home = new Address("Home", "123 Main St", "Springfield", "IL", "62704");
        Address office = new Address("Office", "456 Corporate Blvd", "Springfield", "IL", "62701");
        Address mailing = new Address("Mailing", "PO Box 789", "Springfield", "IL", "62705");

        // Display the addresses
        home.displayAddress();
        office.displayAddress();
        mailing.displayAddress();
    }
}
