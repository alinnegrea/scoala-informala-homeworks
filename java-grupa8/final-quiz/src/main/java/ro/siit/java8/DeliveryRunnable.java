package ro.siit.java8;

import java.util.Set;

public class DeliveryRunnable implements Runnable{

    private Set<Package> packages;
    private String targetLocation;
    private String deliveryDate;

    public DeliveryRunnable(Set<Package> packages, String targetLocation, String deliveryDate) {
        this.packages = packages;
        this.deliveryDate=deliveryDate;
        this.targetLocation=targetLocation;
    }

    public void run() {
    }
}
