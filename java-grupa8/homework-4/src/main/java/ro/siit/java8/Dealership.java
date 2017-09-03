package ro.siit.java8;

/**
 * @author Alin_Negrea
 * Defines Dealership class characteristics
 * dealershipName
 * location
 * Is in a "has-a" relationship with Customer class and Car class
 */

public class Dealership {
    private String dealershipName;
    private String location;
    private Customer customer;
    private Car car;

    public Dealership(String dealershipName, String location, Customer customer, Car car) {
        this.dealershipName = dealershipName;
        this.location = location;
        this.customer = customer;
        this.car = car;
    }

    public String getDealershipName() {
        return dealershipName;
    }

    public String getLocation() {
        return location;
    }

    public Customer getCustomer() {
        return customer;
    }

    public Car getCar() {
        return car;
    }
}


