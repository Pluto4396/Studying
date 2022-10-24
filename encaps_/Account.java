package com.myself.encaps_;

public class Account {
    String name;
    private double salary;
    private String password;

    public void setName(String name) {
        if (name.length() == 2 || name.length() == 3 || name.length() == 4) {
            this.name = name;
        }else {
            System.out.println("输入的名字应该大于2个字符小于4个字符，输出默认值");
            this.name = null;
        }
    }

    public void setSalary(double salary) {
        if (salary > 20){
            this.salary = salary;
        }else {
            System.out.println("存些钱再来查询吧（输入默认值0）");
            this.salary = 0;
        }
    }

    public void setPassword(String password) {//设置密码
        if (password.length() == 6){
            this.password = password;
        }else {
            System.out.println("密码有误");
        }
    }

    public Double getSalary(String password) {
        if (password.equals(this.password)) {
            return salary;
        }else
            return null;
    }
}
