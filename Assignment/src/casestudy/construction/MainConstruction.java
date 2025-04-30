package casestudy.construction;

import java.util.Scanner;

public class MainConstruction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Contractor ID:");
        String contractorId = scanner.nextLine();

        System.out.println("Enter Contractor Name:");
        String contractorName = scanner.nextLine();

        System.out.println("Enter Initial Material Quantity:");
        double materialQuantity = scanner.nextDouble();

        MaterialDelivery delivery = new MaterialDelivery(contractorId, contractorName, materialQuantity);
        MaterialUsage usage = new MaterialUsage(contractorId, contractorName, materialQuantity);
        CostEstimation estimation = new CostEstimation(contractorId, contractorName, materialQuantity);

        System.out.println("Receiving Material...");
        System.out.println("Enter delivery quantity (1-10 tons):");
        double deliveryQty = scanner.nextDouble();
        delivery.receiveMaterial(deliveryQty);

        System.out.println("Using Material...");
        System.out.println("Enter quantity to use:");
        double usageQty = scanner.nextDouble();
        usage.materialBalance = delivery.materialBalance; // Sync balance
        usage.useMaterial(usageQty);

        System.out.println("Estimating Cost...");
        estimation.estimateCost();
    }
}
