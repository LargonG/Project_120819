package com.ivai;

import java.util.ArrayList;

class Region {
    private ArrayList<Holding> holdings = new ArrayList<>();

    Region(){
        holdings.add(new Village());
    }

    void calcHold(){
        for (Holding holding: holdings) {
            holding.calcPop();
        }
    }

    void showHold(){
        for (Holding holding: holdings) {
            System.out.println("Население: " + holding.pop);
        }
    }
}
