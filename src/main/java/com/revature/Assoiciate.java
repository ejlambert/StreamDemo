package com.revature;

public class Assoiciate {

    private String name;
    private int age;

    public Assoiciate(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Assoiciate [name=" + name + ", age=" + age + "]";
    }
}
