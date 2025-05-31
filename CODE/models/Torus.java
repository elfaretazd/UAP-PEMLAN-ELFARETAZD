package UAP.models;

import UAP.bases.Shape;
import UAP.interfaces.MassCalculable;
import UAP.interfaces.MassConverter;
import UAP.interfaces.PIRequired;
import UAP.interfaces.ShippingCostCalculator;
import UAP.interfaces.ThreeDimensional;

public class Torus extends Shape implements ThreeDimensional, MassCalculable, PIRequired, MassConverter, ShippingCostCalculator {
    private double majorRadius;
    private double minorRadius;

    public Torus() {
        super();
        setName("Donat dengan lubang"); 
    }

    public Torus(double majorRadius, double minorRadius) {
        this(); 
        this.majorRadius = majorRadius;
        this.minorRadius = minorRadius;
    }

    public double getMajorRadius() {
        return majorRadius;
    }

    public double getMinorRadius() {
        return minorRadius;
    }

    @Override
    public double getVolume() {
        return Math.ceil(2 * PI * PI * majorRadius * (minorRadius * minorRadius));
    }

    @Override
    public double getSurfaceArea() {
        return 4 * PI * PI * majorRadius * minorRadius;
    }

    @Override
    public double getMass() {
        return DENSITY * getSurfaceArea() * THICKNESS;
    }

    @Override
    public double gramToKilogram(double gram) {
        return gram / DENOMINATOR;
    }

    @Override
    public double calculateCost(double massInKg) {
        return Math.ceil(massInKg) * PRICE_PER_KG;
    }

    @Override
    public void printInfo() {
        System.out.println("=============================================");
        System.out.println("Volume : " + getVolume()); // printInfo includes volume, surface area, and mass [cite: 6]
        System.out.println("Luas permukaan : " + getSurfaceArea()); // printInfo includes volume, surface area, and mass [cite: 6]
        System.out.println("Massa : " + getMass()); // printInfo includes volume, surface area, and mass [cite: 6]
        System.out.println("Massa dalam kg : " + gramToKilogram(getMass()));
        System.out.println("Biaya kirim : Rp" + (int) calculateCost(gramToKilogram(getMass()))); // Cast to int for output format [cite: 8]
        System.out.println("=============================================");
    }
}
