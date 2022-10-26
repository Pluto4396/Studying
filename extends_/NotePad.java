package com.myself.extends_;

public class NotePad extends Computer {
    private String color;

    public NotePad(String cpu, String neicun, String yingpan, String color) {
        super(cpu, neicun, yingpan);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public String getDetails() {
        return super.getDetails() + " color= " + getColor();
    }
}
