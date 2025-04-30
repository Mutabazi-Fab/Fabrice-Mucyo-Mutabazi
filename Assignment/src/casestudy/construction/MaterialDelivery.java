package casestudy.construction;

public class MaterialDelivery extends ConstructionMaterial {

    public MaterialDelivery(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void receiveMaterial(double quantity) {
        if (quantity >= 1 && quantity <= 10) {
            materialBalance += quantity;
            System.out.println("Delivery successful. New material balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Delivery quantity must be between 1 and 10 tons.");
        }
    }

    @Override
    public void useMaterial(double quantity) {
        // Not used in Delivery
    }

    @Override
    public void estimateCost() {
        // Not used in Delivery
    }
}

