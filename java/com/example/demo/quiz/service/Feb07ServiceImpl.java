package com.example.demo.quiz.service;

import com.example.demo.quiz.service.Feb07Service;

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

    }

    @Override
    public void rps(Scanner scanners) {

    }

    @Override
    public void getprime(Scanner scanner) {
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

    }
}
