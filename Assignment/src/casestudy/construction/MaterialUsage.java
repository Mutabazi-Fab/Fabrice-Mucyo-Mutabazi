package casestudy.construction;

public class MaterialUsage extends ConstructionMaterial {

    public MaterialUsage(String contractorId, String contractorName, double materialQuantity) {
        super(contractorId, contractorName, materialQuantity);
    }

    @Override
    public void receiveMaterial(double quantity) {
        // Not used in Usage
    }

    @Override
    public void useMaterial(double quantity) {
        if (materialBalance - quantity >= 2) {
            materialBalance -= quantity;
            System.out.println("Material used successfully. Remaining balance: " + materialBalance + " tons.");
        } else {
            System.out.println("Error: Not enough material. At least 2 tons must remain.");
        }
    }

    @Override
    public void estimateCost() {
        // Not used in Usage
    }
}

