package ro.siit.java8;

/**
 * @author Alin_Negrea
 * Defines the Customer class characteristics:
 * name
 * cnp
 * adress
 * paymentType - cash, leasing
 */

public class Customer {
    private String name;
    private String cnp;
    private String address;
    private String paymentType;

    public Customer(String name, String cnp, String address, String paymentType) {
        this.name = name;
        this.cnp = cnp;
        this.address = address;
        this.paymentType = paymentType;
    }

    public String getName() {
        return name;
    }

    public String getCnp() {
        return cnp;
    }

    public String getAddress() {
        return address;
    }

    public String getPaymentType() {
        return paymentType;
    }
}
