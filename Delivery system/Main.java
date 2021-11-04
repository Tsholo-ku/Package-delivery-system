package com.company;
public class Main {

    public static void main(String[] args) {
        Package myPackage = new Package("John", "12 Wolf street", "Johannesburg", "Gauteng", 2000, 3.0, 3.75);
        double pack = myPackage.calculateCost();
        System.out.println(pack);


        TwoDayPackage myTwoDayPackage = new TwoDayPackage("John", "12 Wolf street", "Johannesburg", "Gauteng", 2000, 3.0, 3.75, 200.50);
        double pck = myTwoDayPackage.calculateCost();
        System.out.println(pck);

        OvernightPackage myOvernightPackage = new OvernightPackage("John", "12 Wolf street", "Johannesburg", "Gauteng", 2000, 3.0, 3.75, 40.0);
        double fee = myOvernightPackage.calculateCost();
        System.out.println(fee);
    }
}
