package com.myself.extends_;

public class Computer {
    private String cpu;
    private String neicun;
    private String yingpan;

    public Computer(String cpu, String neicun, String yingpan) {
        this.cpu = cpu;
        this.neicun = neicun;
        this.yingpan = yingpan;
    }

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getNeicun() {
        return neicun;
    }

    public void setNeicun(String neicun) {
        this.neicun = neicun;
    }

    public String getYingpan() {
        return yingpan;
    }

    public void setYingpan(String yingpan) {
        this.yingpan = yingpan;
    }
    public String getDetails(){
        return "cpu= " + getCpu() + " neicun= " + getNeicun() + " yingpan= " + getYingpan();
    }
}
