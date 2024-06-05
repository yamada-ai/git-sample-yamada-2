package com.example;

public class Car {
    private String name;

    private int Speed;

    private int velocity;


    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + Speed +
                '}';
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSpeed() {
        return Speed;
    }

    public void setSpeed(int Speed) {
        this.Speed = Speed;
    }
}
