package com.myself.duotai_;

public class Managers extends Employee{
    private double bonus;

    public Managers(String name, double salary, double bonus) {
        super(name, salary);
        this.bonus = bonus;
    }
    public String manage(){
        return getName() + " is managing";
    }
    public double getAnnual(){
        return getSalary() * 12 + bonus;
    }
}
