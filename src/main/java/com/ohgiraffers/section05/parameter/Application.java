package com.ohgiraffers.section05.parameter;

public class Application {

    public static void main(String[] args) {

        /* 목표 메소드의 파라미터에 대해 이해하고 사용할 수 있다. */
        /* 필기
            매개변수(parameter) 로 사용 가능한 자료형
            1. 기본자료형(int, String, char, boolean ,double.)
            2. 기본자료형 배열(int[] , String[], char[])
            3. 클래스자료형
            4. 클래스자료형 배열
            5. 가변인자
         */


    ParameterTest pt = new ParameterTest();

    /* 목차 1. 기본자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        int num = 20;
        pt.testPatameterPrimaryType(num);

    /* 목차 2. 기본자료형 배열을 매개변수로 전달 받는 메소드 호출 확인 */
        int[] iarr = new int[] {1,2,3,4,5};

        System.out.println("인자로 전달하는 값 : " + iarr);
        pt.testParameterPtimaryTypeArray(iarr);


        System.out.print("변경 후 원본 배열의 값 출력  : ");

        for(int i = 0; i < iarr.length; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        /* 목차 3. 클래스 자료형을 매개변수로 전달 받는 메소드 호출 확인 */
        RectAngle r1 = new RectAngle(12.5, 22.5);

        System.out.println("인자로 전달하는 값 : "+ r1);
        pt.testParameterClassType(r1);


        // 필기 메소드 호출 후 값 변경 확인
        System.out.println("변경 후 사각형의 넓이와 둘레=====================");
        r1.calcAtea();
        r1.calcRound();

        /* 목차 4. 클래스 자료형 배열은 두에서 다를 예정이다. */

        /* 목차 5. 가변인자 */
        /* 인자로 전달하는 값으 갯수가 정해지지 않는 경우 가변배열을 이용할 수 있다 */

//        pt.testVariableLengthArrayParmeter();   //인자가 아무것도 없는 경우 에러 발생
        pt.testVariableLengthArrayParmeter("길똥이");  //가변인자는 전달하지 않아도 된다.
        pt.testVariableLengthArrayParmeter("순신 lee","볼링");
        pt.testVariableLengthArrayParmeter("신사임당~","볼링", "축구","배트민턴");
        pt.testVariableLengthArrayParmeter("아무개연",new String[]{"테니스","서예","떡설기" });
    }





}
