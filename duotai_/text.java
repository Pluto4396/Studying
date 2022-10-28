package com.myself.duotai_;

public class text {
    public static void main(String[] args) {
        Employee mary = new Works("mary", 5000);
        Employee tom = new Managers("tom", 8500,10000);
        text n = new text();
        System.out.println(n.showEmpAnnual(mary));
        System.out.println(n.testWork(mary));
        System.out.println(n.showEmpAnnual(tom));
        System.out.println(n.testWork(tom));
    }
    public double showEmpAnnual(Employee e){
        return e.getAnnual();
    }
    public String testWork(Employee e){
        if (e instanceof Works){
            return ((Works) e).work();
        } else if (e instanceof Managers) {
            return ((Managers) e).manage();
        }else
            return "输入有误";
    }
}

