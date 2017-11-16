package ro.siit.java8;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Set<Package> packageList = new HashSet<Package>();
        packageList.add(new Package("Cluj",200,700, "21-nov-17"));
        packageList.add(new Package("Brasov",500,1000, "18-nov-17"));
        packageList.add(new Package("Sibiu",800,1500, "22-nov-17"));
        packageList.add(new Package("Cluj",1000,6800, "18-nov-17"));
        packageList.add(new Package("Sibiu",50,1500, "18-nov-17"));
        packageList.add(new Package("Cluj",600,9000, "29-nov-17"));

        Delivery delivery = new Delivery(packageList,"Sibiu", "22-nov-17", 2);
        delivery.calculateProfit(packageList);
    }

    /*HashSet<DeliveryRunnable> runnables = new HashSet<DeliveryRunnable>();

    }*/

}



