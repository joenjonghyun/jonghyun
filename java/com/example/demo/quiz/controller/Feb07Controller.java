package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.Feb07Service;
import com.example.demo.quiz.service.Feb07ServiceImpl;

import java.util.Scanner;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.leapYear;

/**
 * packageName: com.example.demo.controller
 * fileName     : Fen07Controller
 * author       : 전종현
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        전종현       최초 생성
 */
public class Feb07Controller {
    /**
     * 1. 주사위 dice
     * 2. 가위바위보 Rps
     * 3. 입력받은 두 수 사이에 있는 소수 구하기 getprime
     * 4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear
     * 5. 임의로 입력받은 숫자 맞추기 numburgolf
     * 주사위 식 -> int num = (int) (Math.random() * 6) +1;
     * 가위바위보 식 -> int num= (int)(Math.random()*3);
     */
    public void execute(Scanner scanner) {
        Feb07Service service = new Feb07ServiceImpl();
        while (true) {
            System.out.println("MENU\n" + "0.EXIT\n" +
                    "1. dice\n" +
                    "2. rps\n" +
                    "3. getprime\n" +
                    "4. leapYear\n" +
                    "5. numburgolf\n");
            switch (scanner.next()) {
                case "0":
                    System.out.println("시스템 종료");
                    return;
                case "1":
                    System.out.println("1. 주사위 dice");
                    service.dice(scanner);
                    break;
                case "2":
                    System.out.println("2. 가위바위보 rps");
                    service.rps(scanner);
                    break;
                case "3":
                    System.out.println("3. 입력받은 두 수 사이에 있는 소수 구하기 getprime");
                    service.getprime(scanner);
                    break;
                case "4":
                    System.out.println("4. 자바로 입력받은 연도가 윤년인지 평년인지 판단하기 leapYear");
                    service.leapYear(scanner);
                    leapYear();
                    break;
                case "5":
                    System.out.println("5. 임의로 입력받은 숫자 맞추기 numburgolf");
                    service.numburgolf(scanner);
                    break;
            }
        }
    }

    public static void leapYear() {
        System.out.println("년도를 입력해주세요");
        Scanner scanner= new Scanner(System.in);
        int s = scanner.nextInt();
        if(s % 4 == 0 && s % 100 != 0 || s % 400 == 0){
            System.out.println(s + "년은 윤년이다.");}
        else {
            System.out.println(s + "년은 평년이다.");
        }
    }
}