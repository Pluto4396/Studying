package com.myself.extends_;

public class PC extends Computer{
    private String brand;

    public PC(String cpu, String neicun, String yingpan, String brand) {
        super(cpu, neicun, yingpan);
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public String getDetails(){
        return super.getDetails() + " brand= " + getBrand();
    }
}
