package com.ohgiraffers.section02.encapsulation.problem4;

public class Application01 {


    public static void main(String[] args) {


        /* 목표 접근제한자에 대해 이해하고 직접 필드에 접근하지 못하게 강제화 할 수 있다. */

        /* 목차 .1 private 필드에 직접 접근 하여 compile error 발생 확인 */
        Monster monster1 = new Monster();
//        monster1.name = "프랑켄슈타인"

        /* 필기
            선언한 필드대로 공간은 생성되어 있지만 직접 접근하지 못하고
            public 으로 접근을 허용한 메소드만 이용을 할 수 있게 했다.
            이것이 캡슐화(encapsulation) 라고 한다.
         */
        monster1.setName("미이라");
        monster1.setHp(-200);

        System.out.println(monster1.getInfo());



    }
}
