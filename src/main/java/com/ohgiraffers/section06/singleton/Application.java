package com.ohgiraffers.section06.singleton;

public class Application {
    public static void main(String[] args) {

        // 수업목표. 싱글톤 패턴에 대해 이해하고 이를 구현해보자
        /* 필기.
            singleton pattern 이란??
            어플리케이션이 실행될 때 어떤 클래스가 최초 한 번만 메모리를 할당하고
            그 때 메모리에 인스턴스를 만들어서 하나의 인스턴스를 공유해서 사용하며
            메모리 낭비를 방지할 수 있게 함. (매번 인스턴스를 생성하지 않음)
            장점
            1. 첫 번째 이용 시에는 인스턴스를 생성해야 하므로 속도 차이가 나지 않지만
               두 번째 이용 시에는 인스턴스 생성 시간 없이 사용할 수 있다.
            2. 인스턴스가 절대적으로 한 개만 존재하는 것을 보증할 수 있다.
            단점
            1. 싱글톤 인스턴스가 너무 많은 일을 하거나 많은 데이터를 공유하면 결합도가 높아진다.
            2. 동시성 문제를 고려해서 설계해야 하기 떄문에 난이도가 있다.
         */

        /* 필기.
            싱글톤 구현 방법
            1. 이른 초기화 (Eager Initialization)
            2. 게으른 초기화 (Lazy Initialization)
         */
        /* 목차 1. 이른 초기화 구현 */
        /* 필기 생성자를 이용하여 인스턴스 생성을 막고 getInstance() 메소드를 호출해여 인스턴스 생성 가능 */
//        EagerSingleton eager = new EagerSingleton();
        EagerSingleton eager1 = EagerSingleton.getInstance();
        EagerSingleton eager2 = EagerSingleton.getInstance();

        System.out.println("eager1 의 hashcode : " + eager1.hashCode());
        System.out.println("eager2 의 hashcode : " + eager2.hashCode());


        /* 목차 2. 게으른 초기화 구현 */
        LazySingleton lazy1 = LazySingleton.getInstance();
        LazySingleton lazy2 = LazySingleton.getInstance();

        System.out.println("lazy1 의 hashcode : " + lazy1);
        System.out.println("lazy2 의 hashcode : " + lazy2);

        /* 필기
             이른 초기화를 사용하면 처음 인스턴스 반환 요청에서 속도가 빠르다.
             하지만 클래스를 로드하는 속도는 느리다.
             게으른 초기화를 사용하면 첫 번째 요청에 대한 속도가 두 번째 요청에 대한
             속도보다 느리다.
             하지만 클래스를 로드하는 속도는 빠르다.
         */
    }

}
