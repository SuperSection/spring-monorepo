package org.supersection;

public class Dev {

    private Laptop lpt;

    private int age;

    public Dev() {
        System.out.println("Dev no-arg constructor");
    }

    // here comes Constructor Injection
    public Dev(int age, Laptop laptop) {
        this.age = age;
        laptop.compile();
        System.out.println("Dev parameterized constructor");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // here comes Setter Injection
    public void setLpt(Laptop lpt) {
        this.lpt = lpt;
    }

    public void build() {
        System.out.println();
        System.out.println("Compilation is under process.");
        lpt.compile();
    }
}
