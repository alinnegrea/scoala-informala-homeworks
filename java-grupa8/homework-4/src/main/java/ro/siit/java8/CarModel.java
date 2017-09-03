package ro.siit.java8;

/**
 * @author Alin_Negrea
 * Defines the CarModel class characteristics
 * CarModel extends from CarManufacturer class and has additional characteristics
 * model
 * electriclMotor
 * electricBatteries
 * energyConsumption
 */

public class CarModel extends CarManufacturer {
    private String model;
    private String electricMotor;
    private double electricBatteries;
    private double energyConsumption;

    public CarModel(String manufacturer, String model, String electricMotor, double electricBatteries, double energyConsumption) {
        super(manufacturer);
        this.model = model;
        this.electricMotor = electricMotor;
        this.electricBatteries = electricBatteries;
        this.energyConsumption = energyConsumption;
    }

    public String getModel() {
        return model;
    }

    public String getElectricMotor() {
        return electricMotor;
    }

    public double getElectricBatteries() {
        return electricBatteries;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }
}
