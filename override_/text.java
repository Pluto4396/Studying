package com.myself.override_;

public class text {
    public static void main(String[] args) {
        Person p1 = new Person("mary",25);
        System.out.println(p1.say());
        Person p2 = new Student("jack",15,"22410310151952",152.6);
        System.out.println(p2.say());
    }
}
