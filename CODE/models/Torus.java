package UAP.models;

import UAP.bases.Shape;
import UAP.interfaces.*;

public class Torus extends Shape implements ThreeDimensional, PIRequired, MassCalculable, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        setName("Donat Torus");
    }

    public Torus(double majorRadius, double minorRadius) {
        this();
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    @Override
    public double getVolume() {
        return 2 * PI * PI * majorRadius * minorRadius * minorRadius;
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    @Override
    public double getMass() {
        return getVolume() * DENSITY;
    }

    @Override
    public double gramToKilogram() {
        return getMass() / DENOMINATOR;
    }

    @Override
    public double calculateCost() {
        return Math.ceil(gramToKilogram()) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.printf("Volume          : %.2f\n", getVolume());
        System.out.printf("Luas permukaan  : %.2f\n", getSurfaceArea());
        System.out.printf("Massa           : %.2f\n", getMass());
        System.out.printf("Massa dalam kg  : %.2f\n", gramToKilogram());
        System.out.printf("Biaya kirim     : Rp%.0f\n", calculateCost());
    }
}
