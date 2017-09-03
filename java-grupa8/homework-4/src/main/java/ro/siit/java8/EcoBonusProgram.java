package ro.siit.java8;

/**
 * @author Alin_Negrea
 * Defines EcoBonusProgram characteristics
 * fixedbudget
 * Is in a "has a" relation with Customer class, CarModel class and Dealership class
 */

public class EcoBonusProgram {
    private float fixedBudget;
    private Customer customer;
    private CarModel carModel;
    private Dealership dealership;

    public EcoBonusProgram(float fixedBudget, Customer customer, CarModel carModel, Dealership dealership) {
        this.fixedBudget = fixedBudget;
        this.customer = customer;
        this.carModel = carModel;
        this.dealership = dealership;
    }

    public float getFixedBudget() {
        return fixedBudget;
    }

    public Customer getCustomer() {
        return customer;
    }

    public CarModel getCarModel() {
        return carModel;
    }

    public Dealership getDealership() {
        return dealership;
    }
}
