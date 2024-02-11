package com.movie;

import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;

public class Airport {


    static List<FlyingCar> carsFly = new ArrayList<FlyingCar>();

   static void addFlyingCar() {
        FlyingCar FerrariAir = new FlyingCar(300, 200);
        FlyingCar LamboAir = new FlyingCar(300, 600);
        FlyingCar GoogleAir = new FlyingCar(400, 600);

        carsFly.add(GoogleAir);
        carsFly.add(LamboAir);
        carsFly.add(FerrariAir);
    }





}

