ackage UAP.interfaces;

public interface ShippingCostCalculator {
    int PRICE_PER_KG = 2000;

    double calculateCost(double massInKg);
}
