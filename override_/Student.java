package com.myself.override_;

public class Student extends Person{
    private String id;
    private double score;

    public Student(String name, int age, String id, double score) {
        super(name, age);
        this.id = id;
        this.score = score;
    }

    public String getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public String say(){
        return super.say() + " My id is " + getId() + " My score is " + getScore();
    }
}
