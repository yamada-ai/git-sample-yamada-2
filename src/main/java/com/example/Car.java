package com.example;

public class Car {
    private String name;
    private int nekiSpeed;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + nekiSpeed +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNekiSpeed() {
        return nekiSpeed;
    }

    public void setNekiSpeed(int nekiSpeed) {
        this.nekiSpeed = nekiSpeed;
    }
}
