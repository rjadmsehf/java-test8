package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

public class CarRacer {

    /* 필기
        최초 할당 이후 변경 불가능한 불변의 상태를 나타낸다.
        이를 통해 객체의 안정성과 안전을 보장할 수 있다.
        예기치 않은 상태 변경을 방지하는데 도움이 된다.


     */
    private final Car car = new Car();


    public void startUp(){

        car.startUp();

    }
    public void stepAccelator() {

        car.go();

    }
    public void stepBreak() {

        car.stop();

    }
    public void trunOff(){

        car.turnOff();

    }

    }


