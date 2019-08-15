package com.ivai;

import java.util.ArrayList;

class World {
    static final float SPEED = .001f;

    private ArrayList<Region> regions = new ArrayList<>();
    private Date date;

    World(){
        date = new Date(1, 1, 1, this);
        regions.add(new Region());
        start();
    }

    private void start(){
        while(!date.end()){
            date.skipDay();
            date.waiter();
        }
    }

    void finallyYear(){
        for (Region region: regions) {
            region.showHold();
        }
    }

    void finallyMonth(){
        for (Region region: regions) {
            region.calcHold();
        }
        date.show();
    }
}
