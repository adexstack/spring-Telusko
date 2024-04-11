package org.example;

public class Alien {
    private int age;
    private Laptop lap;
    public Alien() {
        System.out.println("Creating Alien Object");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        System.out.println("Setting age in setter");
        this.age = age;
    }

    public void code(){
        lap.compile();
        System.out.println("coding...");
    }

    public Laptop getLap() {
        return lap;
    }

    public void setLap(Laptop lap) {
        System.out.println("Setting laptop in setter");
        this.lap = lap;
    }
}
