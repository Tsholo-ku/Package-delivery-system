package com.company;

public class OvernightPackage extends Package{
    protected double feePerKg;
    public OvernightPackage(String name, String address, String city, String state, int zip, double weight, double costPerKg, double feePerKg){
        super(name, address, city, state, zip, weight, costPerKg);
        this.feePerKg=feePerKg;
    }

    @Override
    public double calculateCost() {
        return super.calculateCost()+ feePerKg*weight;
    }
}
