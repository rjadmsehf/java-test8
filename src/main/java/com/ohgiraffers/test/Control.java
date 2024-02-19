package com.ohgiraffers.test;

public class Control {

    private final Air air = new Air();

    public void on () {
        air.onOff();
    }
    private void down () {
        air.ondoDown();
    }
    private void up () {
        air.ondoUp();
    }
    private void off(){
        air.off();
    }


}
