package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

import java.util.Random;
import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName     : Feb07ServiceImpl
 * author       : 전종현
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        전종현       최초 생성
 */
public class Feb07ServiceImpl implements Feb07Service {

    @Override
    public void dice(Scanner scanner) {
        int sysDice = (int) (Math.random() * 6 + 1);
        int userDice = new Random().nextInt(6) + 1;
        System.out.printf("유저 : %d 시스템 : %d\n", userDice, sysDice);
        String res = "비겼습니다.";
        if (sysDice != userDice) res = (userDice > sysDice) ? "이겼습니다" : "졌습니다";
        System.out.println(res);

    }

    @Override
    public void rps(Scanner scanners) {
        System.out.println("===가위바위보===");
        System.out.println("1. 가위 2. 바위 3. 보");
        int player = (int) (Math.random() * 3 + 1);
        int com = (int) (Math.random() * 3 + 1);
        String[] rsp = {"가위", "바위", "보"};
        System.out.println("사용자 : " + rsp[player - 1] + ", 컴퓨터 : " + rsp[com - 1]);
        System.out.println(((player - com) == 0) ? "Draw" : (player < ((com - 1) % 3)) ? "Win" : "Lose");

    }

    @Override
    public void getprime(Scanner scanner) {
        System.out.println("===소수 구하기===\n 두개의 숫자를 입력해주세요.");
        int no2 = scanner.nextInt();
        int no1 = scanner.nextInt();
        String res = "";
        if (no2 < no1) { //숫자 정렬
            int temp = no2;
            no2 = no1;
            no1 = temp;
        }
        for (int i = no1; i < no2; i++) {
            for (int j = 2; j <= i; j++) { // 1은 모든수의 약수 이므로 제외한다.
                if (j == i) res += String.format("%d ", i);//약수가 맨 마지막 까지 없다면 소수이므로 res에 더해준다.
                else if (i % j == 0) break;//1과 자신 이외에 나누어 떨어지는 수가 있으므로 소수가 아니다.
            }
        }
        System.out.println(String.format("%d와 %d 사이의 소수는 %s 입니다.", no1, no2, res));
    }



    @Override
    public void leapYear(Scanner scanner) {
        System.out.println("년도를 입력하세요.");
        int i = scanner.nextInt();
        if (i % 4 == 0 && i % 100 == 0 || i % 400 == 0) {
            System.out.println(i + "윤년입니다.");
        }else {
            System.out.println(i + "평년입니다.");
        }
    }

    @Override
    public void numburgolf(Scanner scanner) {
        System.out.println("숫자 맞추기 게임 1~10000사이의 숫자를 입력하세요. 총 기회 10번");
        int num = (int) (Math.random() * 10000) + 1;
        for (int i = 0; i < 10; i++) {
            System.out.println("남은 기회 " + (10 - i) + "번");
            int selNum = scanner.nextInt();
            String res = "정답입니다.";
            if (selNum == num) {
                break;
            } else {
                res = (num > selNum) ? selNum + " 보다 큰 숫자 입니다." : selNum + " 보다 작은 숫자 입니다.";
            }
            System.out.println(res);
        }
    }

}

