package com.ohgiraffers.section02.encapsulation.problem1;

public class Application01 {


    public static void main(String[] args) {


        /* 목표 필드에 직접 접근하는 경우 발생할 수 있는 문제점(1) */
        /* 필기. 필드에 올바르지 않는 값이 들어가도 통제가 불가능하다 */

        // 1번 몬스터 생성
        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);

        // 2번 몬스터 생성
        Monster monster2 = new Monster();
        monster2.name = "헐크";
        monster2.hp = -500;

        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);


        // 3번 몬스터 생성
        Monster monster3 = new Monster();
        monster3.name = "전준규";
        monster3.setHp(-200);

        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);

        }

    }

