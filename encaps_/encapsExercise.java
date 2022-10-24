package com.myself.encaps_;

public class encapsExercise {
    public static void main(String[] args) {
        Account account = new Account();
        account.setPassword("123456");
        System.out.println(account.getSalary("123456"));
    }

}
