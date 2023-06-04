public class Main
{
    public static void main(String[] args)
    {
        double springMaintenanceCost = 100.00;
        double summerMaintenanceCost = 50.00;
        double fallMaintenanceCost = 50.00;
        double winterMaintenanceCost = 100.00;
        double yearlyMaintenanceCost;

        yearlyMaintenanceCost = springMaintenanceCost + summerMaintenanceCost + fallMaintenanceCost + winterMaintenanceCost;

        System.out.println("The Spring maintenance cost is $" + springMaintenanceCost);
        System.out.println("The Summer maintenance cost is $" + summerMaintenanceCost);
        System.out.println("The Fall maintenance cost is $" + fallMaintenanceCost);
        System.out.println("The Winter maintenance cost is $" + winterMaintenanceCost);

        System.out.println("\n Yearly Maintenance Cost:" + "\t" + "$" + String.format("%,.2f", yearlyMaintenanceCost));
    }
}