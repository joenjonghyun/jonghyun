package com.example.demo.service;

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
        System.out.println("년도를 입력해주세요");
        int s = scanner.nextInt();
       if(s % 4 == 0 && s % 100 != 0 || s % 400 == 0){
           System.out.println(s + "년은 윤년이다.");}
       else {
           System.out.println(s + "년은 평년이다.");
       }
    }

    @Override
    public void numburgolf(Scanner scanner) {

    }
}
