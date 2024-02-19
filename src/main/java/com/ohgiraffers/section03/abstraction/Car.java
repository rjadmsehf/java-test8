package com.ohgiraffers.section03.abstraction;

public class Car {

    private boolean isOn;   // 초기에는 시동이 꺼진 false 상태이다. 필기 on off 판단으로 speed 와 연관해서 결과값 도출가능함
    private int speed; // 필기 speed 값으로 아래 식에 대입해서 결과값 만드는 놈

    /* 시동이 걸려있는 상태인 경우 할 일이 없고 , 시동이 걸려있찌 않으면 시동을 건다. */
    public void startUp() {

        if (isOn) {
            System.out.println("이미 시동이 걸려있습니당. ");
        } else {
            this.isOn = true;
            System.out.println("시동을 걸었습니다. 이제 출발 할 준비가 되었습니다. ");
        }
    }

    /* 시동이 걸린 상태인 경우 호출 시 10Km/h 씩 속도를 증가시킨다.*/
    public void go() {
        if (isOn){
            System.out.println("차가 앞으로 움직입니다.");
            this.speed += 10;
            System.out.println("현재 차의 시속은" + this.speed + "Km/h 입니다. ");
        }else {
            System.out.println("차의 시동이 걸려있지 않습니다. 시동을 먼저 걸어주세요" );
        }

    }

    public void stop() {

        if (isOn) {
            if(this.speed > 0 ) {
                this.speed = 0;
                System.out.println("브레이크를 밟았습니다. 차를 멈춥니다.");
            }else {
                System.out.println("차는 이미 멈춰있습니다.");
            }
        }else  {
            System.out.println("차의 시동이 걸려 있지 않습니다. 시동을 먼저 걸어주세요.");
        }
    }
    public void turnOff() {
        if(isOn) {
        if(speed > 0 ){
           System.out.println("현재 주행중으로 시동을 끌수없습니다 차를 멈춰주세요");
        }else {
           this.isOn = false;
           System.out.println("시동을 끕니다 다시운행하려면 시동을 켜주세요");
        }
       }else {
            System.out.println("이미 시동이 꺼져 있는 상태입니다. 시동 상태를 확인해주세요");
        }
    }

}