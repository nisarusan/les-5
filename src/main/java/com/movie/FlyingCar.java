package com.movie;

public class FlyingCar extends Vehicle implements Flyable, Driveable {

    public FlyingCar(int speed, float weight) {
        super(speed, weight);
    }

    @Override
    public void takeOf() {
        System.out.println("TAKING OFF");
    }

    @Override
    public void land() {

        System.out.println("LANDING");
    }

    @Override
    public void changeHeight() {
        System.out.println("CHANGING HEIGHT");
    }

    @Override
    void startEngine() {

        System.out.println("STARTING ENGINE");
    }

    @Override
    void turnOffEngine() {
        System.out.println("TURN OFF");
    }

    @Override
    public void accelerate() {
        System.out.println("Driving hard as fuck");
    }

    @Override
    public void changeGear(int x) {
        System.out.println("Changing gear now");
    }

    @Override
    public void brake() {
        System.out.println("Braaaaking!");
    }
}
