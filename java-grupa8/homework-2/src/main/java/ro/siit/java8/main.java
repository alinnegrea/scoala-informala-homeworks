package ro.siit.java8;

public class main {
    static SalesRepresentatives[] member = new SalesRepresentatives[10];

    public static void main(String[] args) {
        initSalesRepresentatives(0, "John", 9, 800);
        initSalesRepresentatives(1, "David", 25, 150);
        initSalesRepresentatives(2, "Simon", 2, 2400);
        initSalesRepresentatives(3, "Kyle", 6, 300);
        initSalesRepresentatives(4, "Daniel", 1, 400);
        initSalesRepresentatives(5, "Ion", 36, 45);
        initSalesRepresentatives(6, "George", 4, 2000);
        initSalesRepresentatives(7, "Vincent", 12, 640);
        initSalesRepresentatives(8, "Peter", 1, 800);
        initSalesRepresentatives(9, "James", 13, 750);
        System.out.println("List of Sales Representatives based on individual revenue");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name:" + member[i].name + " " + "Sales=" + member[i].sales + " " + "Quota=" + member[i].quota + " " + "Revenue=" + computeRevenue(member[i]));
        }

        SalesRepresentatives[] sortedReps = sort(member);
        System.out.println("List of Sales Representatives sorted based on highest revenue generated:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + sortedReps[i].name + " " + "Revenue=" + computeRevenue(sortedReps[i]));
        }
    }

    public static void initSalesRepresentatives(int position, String name, int sales, int quota) {
        member[position] = new SalesRepresentatives();
        member[position].name = name;
        member[position].sales = sales;
        member[position].quota = quota;
    }

    public static int computeRevenue(SalesRepresentatives member) {

        return member.sales * member.quota;
    }

    public static void swap(int i, int j) {
        SalesRepresentatives memberTemp;
        memberTemp = member[i];
        member[i] = member[j];
        member[j] = memberTemp;
    }

    public static SalesRepresentatives[] sort(SalesRepresentatives[] member) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (computeRevenue(member[j]) < computeRevenue(member[j + 1])) {
                    swap(j, j + 1);

                }
            }
        }
        return member;
    }
}
