package com.ivai;

abstract class Holding {
    int money;
    int pop;
    int food;
    int army;

    private float capBorn, capDied;

    float fert, mort;
    float tax;

    String owner;

    void calcPop(){
        int lastPop = pop;
        int hunger = 0;
        if(food < pop){
            hunger = pop - food;
        }
        int born = born(lastPop);
        int died = died(lastPop,hunger);
        pop += born;
        pop -= died;
    }

    private int born(int lastPop){
        double born = lastPop * fert / 12 + (lastPop * .8 * fert / 12 * Math.random());
        if (born < 1){
            capBorn += born;
            if (capBorn > 1){
                capBorn -= 1;
                return 1;
            }
            return 0;
        }
        return (int)born;
    }

    private int died(int lastPop, int hunger){
        double died = (lastPop - hunger) * mort / 12 + hunger * mort / 12 * (1.02 + Math.random() * 1.6) +(lastPop * .8 * mort / 12 * Math.random());
        if (died < 1){
            capDied += died;
            if (capDied > 1){
                capDied -= 1;
                return 1;
            }
            return 0;
        }
        return (int)died;
    }
}
