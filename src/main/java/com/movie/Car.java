package com.movie;

public class Car extends Vehicle implements Driveable {

    public Car(int speed, int weight) {
        super(speed, weight);
    }
    @Override
    void startEngine() {
        System.out.println("Changing Gear");
    }

    @Override
    void turnOffEngine() {
        System.out.println("Engine turned off");
    }

    @Override
    public void accelerate() {
        System.out.println("Now accelerating with the speed " + speed);
    }
    @Override
    public void changeGear(int x) {
        System.out.println("Now changing gear: " + x);
    }


    public void brake() {
        System.out.println("BRAAAAKING");
    }

}
