package Unit13.CodeIt;

// Kevin Murillo
// Part A

import java.util.*;

class Apartment implements Comparable<Apartment> {
    private String address;
    private String aptNumber;
    private double rent;
    private int bedrooms;

    public Apartment(String address, String aptNumber, double rent, int bedrooms) {
        this.address = address;
        this.aptNumber = aptNumber;
        this.rent = rent;
        this.bedrooms = bedrooms;
    }

    public String getAddress() {
        return address;
    }

    public String getAptNumber() {
        return aptNumber;
    }

    public double getRent() {
        return rent;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    @Override
    public String toString() {
        return address + " Apt number " + aptNumber + "\n   Rent $" + rent + " " + bedrooms + " bedrooms";
    }

    @Override
    public int compareTo(Apartment other) {
        return Double.compare(this.rent, other.getRent());
    }
}