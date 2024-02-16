package com.ohgiraffers.section02.encapsulation.problem3;

public class Application01 {

    public static void main(String[] args) {

        /* 목표 필드에 직접 접근 시 발생하는 문제를 해결하는 방법(3) */

        Monster monster1 = new Monster();
        monster1.setName("드라큘라");
        monster1.setHp(100);

        Monster monster2 = new Monster();
        monster2.setName("프랑켄슈타인");
        monster2.setHp(200);

        Monster monster3 = new Monster();
        monster3.setName("미이라");
        monster3.setHp(-100);

//        System.out.println("monster1 name = " + monster1.name);
//        System.out.println("monster1 hp = " + monster1.hp);
        System.out.println(monster1.getInfo());
        System.out.println(monster2.getInfo());
        System.out.println(monster3.getInfo());


        monster3.kinds = "두치";
        monster3.hp = -100;

        System.out.println("monster.kinds = " + monster3.kinds);
        System.out.println("monster.hp = " + monster3.hp);

    }
}
