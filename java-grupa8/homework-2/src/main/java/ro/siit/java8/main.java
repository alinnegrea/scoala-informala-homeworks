package ro.siit.java8;

/**
 * @author Alin_Negrea
 * A bubble  sort algorithm was implemented to sort an array of Sales Representative objects in descending order.
 * The sorting was done based on the amount of revenue generated via sales.
 * Each representative has a number of sale, and a quota/sale.
 *
 */
public class Main {
    /**
     * Initializing objects from the SalesRepresentatives class.
     * @param member is one object of the
     * @see ro.siit.java8.SalesRepresentatives class.
     */
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

        SalesRepresentatives[] sortedReps = sortSalesRepresentatives(member);
        System.out.println("List of Sales Representatives sorted based on highest revenue generated:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + sortedReps[i].name + " " + "Revenue=" + computeRevenue(sortedReps[i]));
        }
    }

    /**
     * Initalise each Sales Representative member with a position in the array list, name, sales and quota.
     * @param position  position in the array list
     * @param name name of the member or the Sales Representative
     * @param sales  number of sales of the member
     * @param quota quota of sale for the member
     */
    public static void initSalesRepresentatives(int position, String name, int sales, int quota) {
        member[position] = new SalesRepresentatives();
        member[position].name = name;
        member[position].sales = sales;
        member[position].quota = quota;
    }

    /**
     * Compute the revenue for a Sales Representative member based on sales and quote.
     * @param member
     * @return revenue based on the calculation revenue=sales*quota
     */
    public static int computeRevenue(SalesRepresentatives member) {

        return member.sales * member.quota;
    }

    /**
     * Bubble sort method requires a swap method to change the position in the array list based on descending sorting.
     * After the swap, the second member takes the position of the first member and the first member takes the position of the second member.
     * @param i the first member position
     * @param j the second member position
     */
    public static void swapPosition(int i, int j) {
        SalesRepresentatives memberTemp;
        memberTemp = member[i];
        member[i] = member[j];
        member[j] = memberTemp;
    }

    /**
     * Bubble sort method is implemented. The return is an descending order of the Sales Representatives based on revenue.
     * @param member
     * @return
     */
    public static SalesRepresentatives[] sortSalesRepresentatives(SalesRepresentatives[] member) {
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 9 - i; j++) {
                if (computeRevenue(member[j]) < computeRevenue(member[j + 1])) {
                    swapPosition(j, j + 1);

                }
            }
        }
        return member;
    }
}
