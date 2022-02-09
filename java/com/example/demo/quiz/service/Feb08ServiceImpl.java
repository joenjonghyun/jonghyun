package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName     : Feb08ServiceImpl
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public class Feb08ServiceImpl implements Feb08Service{
    @Override
    public void lotto(Scanner scanner) {

    }

    @Override
    public void baseball(Scanner scanner) {

    }

    @Override
    public void booking(Scanner scanner) {

    }

    @Override
    public void bank(Scanner scanner) {
        int money = 0;
        while (true){
            System.out.println("0.Exit | 1. 입금 2. 출금 3. 잔고");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("1.입금");
                    money += scanner.nextInt();
                    break;
                case "2" :
                    System.out.println("2.출금");
                    money -= scanner.nextInt();
                    break;
                case "3" :
                    System.out.println("3.잔고");
                    System.out.println("잔고는 : " + money);
                    break;
                default:
                    System.out.println("잘못된 숫자");break;
            }
        }
    }

    @Override
    public void gugudan(Scanner scanner) {

    }
}
