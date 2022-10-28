package com.myself.equals_;

public class Person {
    private String name;
    private int age;
    private char gender;

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public char getGender() {
        return gender;
    }

    public boolean equals(Person p){
        if (this.age == p.getAge() && this.gender == p.getGender() && ){
            return true;
        }else
            return false;
    }
}
