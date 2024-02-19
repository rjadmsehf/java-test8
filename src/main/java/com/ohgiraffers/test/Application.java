package com.ohgiraffers.test;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        /* 목차 에어컨을 켜보자
            필요한것
            전원 on off
            온도 조절
             나  ,  에어컨을 , 리모컨

         */
        Control cs = new Control();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println(" 리모컨을 들었습니다.");
            System.out.println("===============================");
            System.out.println(" 1. 에어컨 전원 키기 ");
            System.out.println(" 2. 에어컨 온도 1도 낯추기 " );
            System.out.println(" 3. 에어컨 온도 1도 높이기 " );
            System.out.println(" 4. 에어컨 전원 끄기 " );
            System.out.println(" 5. 리모컨 내려놓기 ");

            System.out.println(" 번호를 입력해주세요 ");
            int num = sc.nextInt();

            switch(num){
                case 1 :
                    cs.on();
                    break;
                case 2 :
                    cs.down();
                    break;
                case 3 :
                    cs.up();
                    break;
                case 4 :
                    cs.off();
                    break;
                case 5 :
                    System.out.println("리모콘을 내려놓습니다");
                    break;
                default:
                    System.out.println("잘못된 숫자를 입력하셧네요!");
            }
            if( num == 5  ) {
                break;
            }


        }
    }
}
