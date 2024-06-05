package com.example;

public class Car {
    private String name;

    private int Speed;

    private String goodPoint = "テスト満点！";

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + Speed +
                '}';
    }

    public void sayHello(){
        System.out.println("実は運転手は山田です");
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
