package casestudy.construction;

public abstract class ConstructionMaterial {
    protected String contractorId;
    protected String contractorName;
    protected double materialQuantity;
    protected double materialBalance;

    public ConstructionMaterial(String contractorId, String contractorName, double materialQuantity) {
        this.contractorId = contractorId;
        this.contractorName = contractorName;
        this.materialQuantity = materialQuantity;
        this.materialBalance = 0; // Start with 0 balance
    }

    public abstract void receiveMaterial(double quantity);
    public abstract void useMaterial(double quantity);
    public abstract void estimateCost();
}

