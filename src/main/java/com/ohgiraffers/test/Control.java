package com.ohgiraffers.test;

public class Control {

    private final Air air = new Air();

    public void on () {
        air.onOff();
    }

    public void down () {
        air.ondoDown();
    }
    public void up () {
        air.ondoUp();
    }
    public void off(){
        air.off();
    }

}
