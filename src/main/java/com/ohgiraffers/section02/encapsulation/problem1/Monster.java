package com.ohgiraffers.section02.encapsulation.problem1;

public class Monster {


    String name; // 몬스터 이름
    int hp; // 몬스터 체력


    public void setHp(int hp){
        if (hp > 0 ) {


            /* 필기
                this 는 인스턴스가 생성 되었을 때 자신의 주소를 저장하는 래퍼런스 변수이다.
                지역변수와 전역변수의 이름이 동일한 경우 지역변수를 우선 접근하기 때문에
                전역변수에 접근하기 위해서 this. 을 명시해준다
             */
            System.out.println("양수의 값이 입력되어서 정상적으로 변경 되었습니다");
            this.hp = hp;
        }else {

            System.out.println("0보다 작거나 같은 값이 입력되어 몬스터의 체력을 0으로 변경합니다.");
            this.hp= 0;

        }
    }


}
