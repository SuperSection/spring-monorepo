package com.supersection;

public class Dev {

    private Computer comp;

    private int age;

    public Dev() {
        System.out.println("Dev no-arg constructor");
    }

    // here comes Constructor Injection
    public Dev(int age, Computer computer) {
        this.age = age;
        computer.compile();
        System.out.println("Dev parameterized constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // here comes Setter Injection
/*    public void setLpt(Laptop lpt) {
        this.lpt = lpt;
    } */

    // provide Setter Injection for this
    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void build() {
        System.out.println("Compilation is under process.");
        comp.compile();
    }
}
