package casestudy.construction;

public class CostEstimation extends ConstructionMaterial {

    public CostEstimation(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void receiveMaterial(double quantity) {
        // Not used in Cost Estimation
    }

    @Override
    public void useMaterial(double quantity) {
        // Not used in Cost Estimation
    }

    @Override
    public void estimateCost() {
        double costPerTon = (materialQuantity > 15) ? 180000 : 200000;
        double totalCost = materialQuantity * costPerTon;
        System.out.println("Contractor: " + contractorName + " (" + contractorId + ")");
        System.out.println("Material Quantity Used: " + materialQuantity + " tons");
        System.out.printf("Total Cost: %, .2f RWF\n", totalCost);
    }
}

