package com.company;

public class Package {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zip;
    protected double weight;
    protected double costPerKg;

    public Package(String name, String address, String city, String state, int zip, double weight, double costPerKg){
           this.name = name;
           this.address = address;
           this.city = city;
           this.state = state;
           this.zip = zip;
           if(weight>0 && costPerKg>0){
            this.weight = weight;
            this.costPerKg = costPerKg;}
           else {
               System.out.println("Invalid amount!");
           }
       }


    public double calculateCost(){
        double cost = costPerKg * weight;
        return cost;
    }
}

