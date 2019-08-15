package com.ivai;

class Village extends Holding {
    Village(){
        this.pop = 100;
        this.food = (int)(pop * 1.5f);
        this.fert = .028f;
        this.mort = .023f;
    }
}
