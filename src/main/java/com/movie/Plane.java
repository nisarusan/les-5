package com.movie;

public class Plane extends Vehicle implements Flyable {

    public Plane(int speed, int weight) {
        super(speed, weight);
    }

    @Override
        void startEngine() {
        System.out.println("Starting Plane Motor");
    }

    @Override
    void turnOffEngine() {
        System.out.println("Turning Motor Off");
    }


    @Override
    public void takeOf() {
        System.out.println("TAKING OFF AIRPLANE");
    }

    @Override
    public void land() {
        System.out.println("LANDING PLANE");
    }

    @Override
    public void changeHeight() {
        System.out.println("CHANGING HEIGHT");
    }


}
