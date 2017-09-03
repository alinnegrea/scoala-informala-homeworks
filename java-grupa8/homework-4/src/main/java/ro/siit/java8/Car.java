package ro.siit.java8;

import java.util.Date;

/**
 * @author Alin_Negrea
 * Defines Car class characteristics
 * Car extends from CarModel class and has additional characteristics
 * productionDate
 * chassisNumber
 * color
 * price
 */

public class Car extends CarModel {
    private Date productionDate;
    private String chassisNumber;
    private String color;
    private float price;

    public Car(String manufacturer, String model, String electricMotor, double electricBatteries, double energyConsumption, Date productionDate, String chassisNumber, String color, float price) {
        super(manufacturer, model, electricMotor, electricBatteries, energyConsumption);
        this.productionDate = productionDate;
        this.chassisNumber = chassisNumber;
        this.color = color;
        this.price = price;
    }

    public Date getProductionDate() {
        return productionDate;
    }

    public String getChassisNumber() {
        return chassisNumber;
    }

    public String getColor() {
        return color;
    }

    public float getPrice() {
        return price;
    }
}
