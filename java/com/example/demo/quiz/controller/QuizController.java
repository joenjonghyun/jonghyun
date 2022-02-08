package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.*;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName     : TempController
 * author       : 전종현
 * date         : 2022-02-03
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03        전종현       최초 생성
 */
public class QuizController {
    public void execute(Scanner scanner){
        Feb06Service feb06Service = new Feb06ServiceImpl();
        Feb07Service feb07Service = new Feb07ServiceImpl();
        Feb08Service feb08Service = new Feb08ServiceImpl();
        while (true){
            System.out.println("[서브메뉴]\n" + " 0. Exit " + " 1. 2월6일 " + " 2. 2월 7일" + " 3. 2월 8일 " + " 4. 2월 9일 ");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");
                    return;
                case "1" : String[] arr = {"홍정명", "전종현", "노홍주", "양정오", "정경준",
                        "깊이", "탐욕법", "정렬", "이분탐색", "완전탐색",
                        "너비우선탐색", "해시", "힙", "그래프", "DP",
                        "스택", "", "", "", "",
                        "큐"};
                    System.out.println("[소메뉴]\n" + "0.Exit\n" + " 1. 팀별과제\n " + "2. 팀장이 맡은 과제\n" + " 3. 큐를 담당한 사람\n" + "4. 팀원이 맡은 과제 수\n");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("0.Exit");return;
                        case "1" :
                            System.out.println("1.팀별과제");
                            feb06Service.quiz1(arr);break;
                        case "2" :
                            System.out.println("2. 팀장이 맡은 과제");
                            feb06Service.quiz2(arr);break;
                        case "3" :
                            System.out.println("3. 큐를 담당한 사람");
                            feb06Service.quiz3(arr);break;
                        case "4" :
                            System.out.println("4. 팀원이 맡은 과제 수");
                            feb06Service.quiz4(arr);break;
                        default:
                            System.out.println("worng number");
                            break;
                    }
                    System.out.println("[소메뉴]\n" + "0.Exit \n" +  "1.주사위 \n" + "2.가위바위보 \n" + "3.소수 구하기\n" + "4.윤년/평년\n" + "5.임의숫자 맞추기");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("0.Exit");return;
                        case "1" :
                            System.out.println("1. 주사위");
                            feb07Service.dice(scanner);
                            break;
                        case "2" :
                            System.out.println("2. 가위바위보");
                            feb07Service.rps(scanner);
                            break;
                        case "3" :
                            System.out.println("3. 소수 구하기");
                            feb07Service.getprime(scanner);
                            break;
                        case "4" :
                            System.out.println("4. 윤년/평년");
                            feb07Service.leapYear(scanner);
                            break;
                        case "5" :
                            System.out.println("5. 임의숫자 맞추기");
                            feb07Service.numburgolf(scanner);
                            break;
                        default:
                            System.out.println("wrong number");
                            break;
                    }
                    System.out.println("[소메뉴]\n" + "0.Exit \n" +  "1.로또 \n" + "2.야구 \n" + "3.좌석예약\n" + "4.은행 입출금\n" + "5.구구단");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("0.Exit");
                            return;
                        case "1" :
                            System.out.println("1. 로또");
                            feb08Service.lotto(scanner);
                            break;
                        case "2" :
                            System.out.println("2.야구");
                            feb08Service.baseball(scanner);
                            break;
                        case "3" :
                            System.out.println("3.좌석예약");
                            feb08Service.booking(scanner);
                            break;
                        case "4" :
                            System.out.println("4.은행 입출금");
                            feb08Service.bank(scanner);
                            break;
                        case "5" :
                            System.out.println("5.구구단");
                            feb08Service.gugudan(scanner);
                            break;
                        default:
                            System.out.println("worng number");break;
                    }
            }
        }


    }
    }




