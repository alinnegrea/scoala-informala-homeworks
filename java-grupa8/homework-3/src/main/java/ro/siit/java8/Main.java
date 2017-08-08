package ro.siit.java8;

/**
 * @author Alin_Negrea
 * A bubble  sort algorithm was implemented to sort an array of Sales Representative objects in descending order.
 * The sorting was done based on the amount of revenue generated via sales.
 * Each representative has a number of sale, and a quota/sale.
 */
public class Main {
    /**
     * Initialising objects from the SalesRepresentative class.
     *
     * @param member is one object of the
     * @see ro.siit.java8.SalesRepresentative class.
     */
    static SalesRepresentative[] member = new SalesRepresentative[20];
    /**
     * Initialising objects from the SalesDepartment class.
     * @param salesDepartment is an object of the
     * @see  ro.siit.java8.SalesDepartment class.
     */
    static SalesDepartment[] salesDepartment = new SalesDepartment[4];

    public static void main(String[] args) {
        initSalesRepresentative(0, "John", "A", 9, 800);
        initSalesRepresentative(1, "David", "B", 25, 150);
        initSalesRepresentative(2, "Simon", "C", 2, 2400);
        initSalesRepresentative(3, "Kyle", "D", 6, 300);
        initSalesRepresentative(4, "Daniel", "A", 1, 400);
        initSalesRepresentative(5, "Ion", "B", 36, 45);
        initSalesRepresentative(6, "George", "C", 4, 2000);
        initSalesRepresentative(7, "Vincent", "D", 12, 640);
        initSalesRepresentative(8, "Peter", "A", 1, 800);
        initSalesRepresentative(9, "James", "B", 13, 750);
        initSalesRepresentative(10, "John", "C", 19, 800);
        initSalesRepresentative(11, "David", "D", 30, 150);
        initSalesRepresentative(12, "Simon", "A", 12, 2400);
        initSalesRepresentative(13, "Kyle", "B", 3, 300);
        initSalesRepresentative(14, "Daniel", "C", 6, 400);
        initSalesRepresentative(15, "Ion", "D", 69, 45);
        initSalesRepresentative(16, "George", "A", 1, 2000);
        initSalesRepresentative(17, "Vincent", "B", 12, 6400);
        initSalesRepresentative(18, "Peter", "C", 14, 800);
        initSalesRepresentative(19, "James", "D", 28, 750);

        System.out.println("List of Sales Representatives based on individual revenue");
        for (int i = 0; i < member.length; i++) {
            System.out.println("Name: " + member[i].name + " " + "Department: " + member[i].department + " " + "Sales=" + member[i].sales + " " + "Quota=" + member[i].quota + " " + "Revenue=" + computeRevenue(member[i]));
        }

        SalesRepresentative[] sortedReps = sortSalesRepresentatives(member);
        System.out.println("List of Sales Representatives sorted based on highest revenue generated:");
        for (int i = 0; i < member.length; i++) {
            System.out.println("Name: " + sortedReps[i].name + " " + "Revenue=" + computeRevenue(sortedReps[i]));
        }

        computeTotalSales(member);

        initSalesDepartment(0, "Department A", computeSalesDepartment("A"));
        salesDepartment[0].sales = computeSalesDepartment("A");
        System.out.println("Department " + "A" + " has a total number of sales of " + salesDepartment[0].sales);
        initSalesDepartment(1, "Department B", computeSalesDepartment("B"));
        System.out.println("Department " + "B" + " has a total number of sales of " + salesDepartment[1].sales);
        initSalesDepartment(2, "Department C", computeSalesDepartment("C"));
        System.out.println("Department " + "C" + " has a total number of sales of " + salesDepartment[2].sales);
        initSalesDepartment(3, "Department B", computeSalesDepartment("D"));
        System.out.println("Department " + "D" + " has a total number of sales of " + salesDepartment[3].sales);

        int maxSales = Math.max(salesDepartment[0].sales, Math.max(salesDepartment[1].sales, Math.max(salesDepartment[2].sales, salesDepartment[3].sales)));
        if (maxSales == salesDepartment[0].sales) {
            System.out.println("The department with most sales inside the company is Department A with a total sales of " + salesDepartment[0].sales);
        } else if (maxSales == salesDepartment[1].sales) {
            System.out.println("The department with most sales inside the company is Department B with a total sales of " + salesDepartment[1].sales);
        } else if (maxSales == salesDepartment[2].sales) {
            System.out.println("The department with most sales inside the company is Department C with a total sales of " + salesDepartment[2].sales);
        } else if (maxSales == salesDepartment[3].sales) {
            System.out.println("The department with most sales inside the company is Department D with a total sales of " + salesDepartment[3].sales);
        } else {
            System.out.println("Something is wrong");
        }
        System.out.println("The best sales representative from company is " + member[0].name + " from Department " + member[0].department + " with a total sales value of " + computeRevenue(member[0]));
    }

    /**
     * Initialise each Sales Representative member with a position in the array list, name, department, sales and quota.
     *
     * @param position   position in the array list
     * @param department department name of the Sales Representative
     * @param name       name of the member of the Sales Representative
     * @param sales      number of sales of the member
     * @param quota      quota of sale for the member
     */
    public static void initSalesRepresentative(int position, String name, String department, int sales, int quota) {
        member[position] = new SalesRepresentative();
        member[position].name = name;
        member[position].department = department;
        member[position].sales = sales;
        member[position].quota = quota;
    }

    /**
     * Compute the revenue for a Sales Representative member based on sales and quote.
     *
     * @param member
     * @return revenue based on the calculation revenue=sales*quota
     */
    public static int computeRevenue(SalesRepresentative member) {

        return member.sales * member.quota;
    }

    /**
     * Bubble sort method requires a swap method to change the position in the array list based on descending sorting.
     * After the swap, the second member takes the position of the first member and the first member takes the position of the second member.
     *
     * @param i the first member position
     * @param j the second member position
     */
    public static void swapPosition(int i, int j) {
        SalesRepresentative memberTemp;
        memberTemp = member[i];
        member[i] = member[j];
        member[j] = memberTemp;
    }

    /**
     * Bubble sort method is implemented. The return is an descending order of the Sales Representatives based on revenue.
     *
     * @param member
     * @return
     */
    public static SalesRepresentative[] sortSalesRepresentatives(SalesRepresentative[] member) {
        boolean swapped = true;
        while (swapped) {
            swapped = false;
            for (int i = 1; i < member.length; i++) {
                if (computeRevenue(member[i - 1]) < computeRevenue(member[i])) {
                    swapPosition(i - 1, i);
                    swapped = true;
                }
            }
        }
        return member;
    }

    /**
     * Initialise each department in the company with a position, name and sales
     * @param position position in the array list
     * @param name  name of the department
     * @param sales number of sales for each department
     */
    public static void initSalesDepartment(int position, String name, int sales) {
        salesDepartment[position] = new SalesDepartment();
        salesDepartment[position].name = name;
        salesDepartment[position].sales = sales;
    }

    /**
     * Compute the total value of company sales
     * @param member
     * @return
     */

    public static SalesRepresentative[] computeTotalSales(SalesRepresentative[] member) {
        int totalSales = 0;
        for (int i = 0; i < member.length; i++) {
            totalSales += computeRevenue(member[i]);
        }
        System.out.println("Total value of company sales is " + totalSales);
        return member;
    }

    /**
     * Compute total number of sales of one department as input.
     * @param department name of the department 
     * @return
     */
    public static int computeSalesDepartment(String department) {
        int totalDepartmentSales = 0;
        for (int i = 0; i < member.length; i++) {
            if (member[i].department == department) {
                totalDepartmentSales += member[i].sales;
            }
        }
        return totalDepartmentSales;
    }

}
