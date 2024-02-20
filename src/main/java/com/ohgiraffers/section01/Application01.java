package com.ohgiraffers.section01;

public class Application01 {

    public static void main(String[] args) {

        /* 목표 클래스가 무엇인지 이해하고 작성할 수 있다.*/

        /* 필기
            회원 정보를 관리하기 위해 화원의 여러 정보(아이다, 비밀번호, 이름 , 나이 , 성별 , 취미 , )를 관리

         */

        /* 목차 1. 변수를 이용한 회원데이터 관리 */
        String id = "user01";
        String pwd = "pass01";
        String name = "전준규";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"야구" , "배드민턴", "탁구"};

        System.out.println("id = " + id);
        System.out.println("pwd = " + pwd);
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.print("hobby = " );
        for(int i = 0; i < hobby.length; i ++){
            System.out.print(hobby[i] + " ");


        }
        System.out.println();

        /* 필기
            이렇게 각각의 변수로 관리하게 되면 여러 가지 단점이 있다.
            1. 변수명을 다 관리해야 하는 어려움이 생긴다.
            2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
               너무 많은 값들을 인자로 전달해야 해서 한 눈에 안 들어온다.
            3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴 값으로 사용할 수 없다.
               (서로 다른 자료형들이기 때문이다.)
         */

        /* 목차 2. 사용자 정의의 자료형 사용하기 */
        /* 목차 2-1 변수 선언 및 객체 생성 */


        /* 필기
            자료형 변수명 = new 클래스명(); <- 지금까지 사용한 이 구문은 객체(instance)를 생성한는 구문이다.
            사용자 정의의 자료형인 클래스를  이용하기 위해서는 new 연산자로 heap 공간에 할당을 해야한다.
            객체를 생성하게 되면 클래스에 정의한 필드와 메소드 대로 객체(instance) 가 생성된다.
            아이디, 비밀번호, 이름, 나이, 성별 ,취미를 연속된 메모리 공간(주소) 에서 사용하도록 공간을 만들었다.
            클래스에 작성한 내용대로 사용할 수 있다.
         */


        Member member = new Member();
        /* 목차. 2-2. 생성된 인스턴스의 초기값 확인하기   */

       /* 필기.
           이렇게 위에서처럼 객체를 생성하고 나면, 서로 다른 자료형들은 하나의 member 라는 변수명으로
           관리할 수 있도록 공간을 생성한 것이다.
           heap 이라는 공간에 생성되기 때문에 jvm 이 제공하는 기본값들로 초기화 된다.
        */

        /* 필기.
            필드에 접근하기 위해서는 래퍼런스변수명.필드명 <- 이렇게 접근한다.
            '.' 참조연산자 라고 하는데, 래퍼런스 변수가 참조하고 있는 주소로 접근한다 라는 의미.
            각 공간은 필드명으로 접근한다.
         */

        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);


        /* 목차. 2-3. 필드에 접근해서 변수 사용하듯 사용해보기 */
        member.id = "user01";
        member.pwd = "pass01";
        member.name = "전준규";
        member.age = 20;
        member.gender = '남';
        member.hobby = new String[] { "축구","볼링","테니스"};

        System.out.println("변경 후 id = " + member.id);
        System.out.println("변경 후 pwd = " + member.pwd);
        System.out.println("변경 후 name = " + member.name);
        System.out.println("변경 후 age = " + member.age);
        System.out.println("변경 후 gender = " + member.gender);
//        System.out.println("변경 후 member.hobby = " + member.hobby); 주소값만 나온다
        System.out.print("변경 후 member.hobby : ");
        for(int i = 0; i < member.hobby.length; i++){
            System.out.print(member.hobby[i] + " ");
        }
        System.out.println();





    }


}
