package ro.siit.java8;

import java.util.Set;

public class Delivery {
    private Set<Package> packages;
    private String destination;
    private String givenDate;
    private int fixedRate;

    public Delivery(Set<Package> packages, String destination, String givenDate, int fixedRate) {
        this.packages = packages;
        this.destination = destination;
        this.givenDate = givenDate;
        this.fixedRate = fixedRate;
    }


    public void calculateProfit(Set<Package> packages) {
        int profit=0;
        int totalMerchendisevalue=0;
        for (Package p:
             packages) {
            if (p.getTargetLocation().equals(destination)&p.getDeliveryDate().equals(givenDate)){
                profit=p.getMerchandiseValue()-fixedRate*p.getDistance();
                totalMerchendisevalue+=p.getMerchandiseValue();
            }
            
        }
        System.out.println("For " + givenDate + " delivered to " + destination + " total merchandise value is " + totalMerchendisevalue + " with a profit of " + profit);
    }


}
