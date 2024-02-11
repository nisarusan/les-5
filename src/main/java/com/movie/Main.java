package com.movie;

public class Main {
    public static void main(String[] args) {
        Car Ferrari = new Car(3, 300);
        Ferrari.brake();
        Ferrari.accelerate();
        Ferrari.changeGear(5);
        System.out.println("Hello world!");
        Airport.addFlyingCar();
    }
}