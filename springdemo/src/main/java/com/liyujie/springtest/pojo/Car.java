package com.liyujie.springtest.pojo;

public class Car {
    private String name;
    private String price;
    private double speed;
    public Car(String name, String price) {

        this.name = name;
        this.price = price;
    }
    public Car(String price, double speed) {
        this.price = price;
        this.speed = speed;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public Car(String name, String price, double speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price='" + price + '\'' +
                ", speed=" + speed +
                '}';
    }



}
