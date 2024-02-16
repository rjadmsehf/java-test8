package com.ohgiraffers.section02.encapsulation.problem4;

public class Monster {

    /* 필기.
        접근제한자
        클래스 혹은 클래스의 멤버에 참조얀산자로 접근 할 수 있는 범위를 "제한 하기위한 키워드
        1. public : 모든 패키지에 접근 허용
        2. protected : 동일 패키지에 접근 허용. (단, 상속관계에 있는 경우 다른 패키지도 가능)
        3. default : 동일 패키지에서만 접근 허용 (작성하지 않는 것이 default)
        4. private : 해당 클래스 내부에서만 접근 허용

        필기.
              위의 네 가지 접근제한자는 클래스의 멤버(필드, 메소드)에 도무 사용 가능하다.
              (단, 클래스 선언 시 사용하는 접근제한자는 public 과 default 만 가능하다.)

     */
    private String name;
    private int hp;


    public void  setName(String name) {

        this.name = name;

    }

    public void  setHp(int hp) {

        if (hp > 0) {
            this.hp = hp;
        }else {
            this.hp = 0;
        }
    }

    public String getInfo() {

        return "몬스터의 이름은 " + this.name + " 이고, 체력은 "  + this.hp + "입니다.";

    }
}
