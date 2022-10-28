package com.myself.equals_;

public class Text_ {
    public static void main(String[] args) {
        Person p1 = new Person("tom", 15, '男');
        Person p2 = new Person("tom", 15, '男');
        Person p3 = new Person("tom", 15, '女');
        Person p4 = new Person("mary", 15, '女');
        System.out.println(p1.equals(p2));
        System.out.println(p1.equals(p3));
        System.out.println(p4.equals(p3));
    }
}