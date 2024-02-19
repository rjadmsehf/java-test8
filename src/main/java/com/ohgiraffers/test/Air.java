package com.ohgiraffers.test;

public class Air {

    private boolean isOn;
    private int C = 24;

    public void onOff() {
    if(isOn){
        System.out.println(" 에어콘이 켜져있습니다.");

    }else {
        this.isOn = true;
        System.out.println("에어컨이 켜졌습니다." );
    }
    }
    public void ondoDown() {
        if (isOn){
            System.out.println("온도가 1도 내려갔습니다.");
            this.C = --C;
        }else {
            System.out.println("에어컨이 켜지지 않았습니다");

        }
    }
    public void ondoUp(){
        if (isOn){
            System.out.println("온도가 1도 올라갔습니다.");
            this.C = ++C;
        }
    }
    public void off() {
        if (isOn){
            System.out.println(" 에어컨이 작동을 종료합니다 ");
            this.isOn = false;
        }else {
            System.out.println("에어컨이 꺼져있습니다.");
        }
    }


}
