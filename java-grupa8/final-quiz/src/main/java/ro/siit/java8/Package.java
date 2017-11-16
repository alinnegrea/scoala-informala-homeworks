package ro.siit.java8;

public class Package {
    private String targetLocation;
    private int distance;
    private int merchandiseValue;
    private String deliveryDate;

    public Package(String targetLocation, int distance, int merchandisevalue, String deliveryDate) {
        this.targetLocation = targetLocation;
        this.distance = distance;
        this.merchandiseValue = merchandisevalue;
        this.deliveryDate = deliveryDate;
    }

    public String getTargetLocation() {
        return targetLocation;
    }

     public int getDistance() {
        return distance;
    }

    public int getMerchandiseValue() {
        return merchandiseValue;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }


}
