package com.company;

public class TwoDayPackage extends Package{
    private double flatFee;


    public TwoDayPackage(String name, String address, String city, String state, int zip, double weight, double costPerKg, double flatFee){
        super(name,address,city, state, zip, weight, costPerKg);
        this.flatFee=flatFee;
    }

    @Override
    public double calculateCost(){
        double cost = costPerKg * weight;
        double total = cost + flatFee;
        return total;
    }
}