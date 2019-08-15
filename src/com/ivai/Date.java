package com.ivai;

class Date {
    private int day, month, year;

    private World world;

    Date(int day, int month, int year, World world){
        this.month = month;
        this.day = day;
        this.year = year;
        this.world = world;
    }

    void skipDay(){
        day++;
        checkDate();
    }

    private void checkDate(){
        if(day > 30){
            month += day / 30;
            day %= 30;
            if(month > 12){
                year += month / 12;
                month %= 12;
                world.finallyMonth();
                world.finallyYear();
                return;
            }
            world.finallyMonth();
        }
    }

    void waiter(){
        long now = System.nanoTime();
        long prev = System.nanoTime();
        while (now - prev < World.SPEED * 1000000000){
            now = System.nanoTime();
        }
    }

    boolean end(){
        return year > 1000000;
    }

    void show(){
        System.out.println("День - " + day + " Месяц - " + month + " Год - " + year);
    }
}
