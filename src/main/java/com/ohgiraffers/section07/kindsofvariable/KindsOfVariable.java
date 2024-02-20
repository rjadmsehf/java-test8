package com.ohgiraffers.section07.kindsofvariable;

public class KindsOfVariable { // 클래스 영역의 시작

    /* 목표 다양한 변수들을 이해하고 사용할 수 있다. */
    /* 필기
        클래스 영역에 작성하는 변수를 필드라고 한다.
        필드 == 멤버뱐수(클래스가 가지는 멤버라는 의미) == 전역변수(클래스 전역에서 사용 가능)
     */
    /* 필기. non-static field를 인스턴스 변수 라고 한다. (인스턴스 생성 시점에 사용 가능한 변수)*/
    private int globalNum;

    /* 필기. static field를 정적필드(클래스변수) 라고 한다. (정적(클래스) 영역에 생성되는 변수라는 의미
     */
    private static int staticNum;

    public void testMethod(int num) {  // 메소드 영역의 시작

        /* 필기
            메소드 영역에서 작성하는 변수를 지역변수라고 한다.
            메소드 괄호 안에 선언하는 변수를 매개변수라고 한다.
            매개변수도 일종의 지역변수 라고 생각하면 된다.
            지역변수와 매개변수 모두 메소드 호출시 stack을 할당 받아 stack에 생성된다.
         */
        int localNum;

        System.out.println(num);        // 매개변수는 호출 시 값이 넘어와서 변경되기 때문에 초기화가 필요 없다.
//        System.out.println(localNum);  // 지역변수는 선언 외에 다시 사용(호출( 하기 위해서는 반드시 초기화가 되어야 한다.
        System.out.println(globalNum);  // 전역변수는 말 그대로 클래스 내부에서 다 사용할 수 있다.
        System.out.println(staticNum);   // 전역변수는 말 그대로 클래스 내부에서 다 사용할 수 있다.



    }   //메소드 영역의 끄읕

    public void testMethod2() {

//        System.out.println(localNum);         // 지역변수 해당 지역(블럭내부) 에서만 사용 가능하다
//        System.out.println(num);
        System.out.println(globalNum);          // 전역 변수는 다른 메소드 에서도 상관 없이 사용 가능하다.
        System.out.println(staticNum);
    }

}   // 클래스 영역의 끄읕
