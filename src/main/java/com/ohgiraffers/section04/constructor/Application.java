package com.ohgiraffers.section04.constructor;

public class Application {

    public static void main(String[] args) {

        /* 목표 생성자 함수가 무엇인지 이해하고 선언 및 호출할 수 있다. */

        /* 필기.
            생성자란?
            인스턴스를 생성할 때 초기 수행할 명령이 있는 경우 미리 작성해두고, 인스턴스를
            생성할 때(new 키워드를 만날 때) 호출된다.
            생성자 함수에 매개변수가 없는 생성장를 기본 생성자(default constructor) 라고 하며
            기본 생성자는 compiler 에 의해 자동으로 추가되기 때문에 지금까지 명시적으로 작성하지 않고
            사용할 수 있엇다.
         */



        /* 목차 1. 기본 생성자를 호출하여 인스턴스 생성 후 필드값 출력*/
        User user1 = new User();
        System.out.println(user1.getInfo());

        /* 목차 2. id , pwd , name을 매개변수로 전달 받는 생성자 호출하여 인스턴스 생성 후 필드값 출력 */
        User user2 = new User("user01","pass01","홍길동" );
        System.out.println(user2.getInfo());

        /* 목차 3. 모든 필드를 초기화하는 생성자를 호출하여 인스턴스 생성 후 필드값 출력 */
        User user3 = new User("user02","pass02","조평훈" , new java.util.Date() );
        System.out.println(user3.getInfo());
    }


}


