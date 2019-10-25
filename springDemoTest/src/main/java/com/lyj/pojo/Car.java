package com.lyj.pojo;

public class Car {
    private String name;
    private Double price;
    private Double speed;

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", speed=" + speed +
                '}';
    }

    public Double getPrice() {
        return price;
    }

    public Car(String name, Double price, Double speed) {
        this.name = name;
        this.price = price;
        this.speed = speed;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
