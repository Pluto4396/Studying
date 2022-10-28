package com.myself.duotai_;

public class Works extends Employee{
    public Works(String name, double salary) {
        super(name, salary);
    }
    public String work(){
        return getName() + " is woking";
    }
    public double getAnnual(){
        return getSalary() * 12;
    }
}
