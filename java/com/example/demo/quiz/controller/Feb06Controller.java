package com.example.demo.quiz.controller;

import com.example.demo.quiz.service.QuizService;
import com.example.demo.quiz.service.QuizServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.controller
 * fileName     : Feb06Controller
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public class Feb06Controller {
    public void execute(Scanner scanner) {
        String[] arr = {"홍정명", "전종현", "노홍주", "양정오", "정경준",
                "깊이", "탐욕법", "정렬", "이분탐색", "완전탐색",
                "너비우선탐색", "해시", "힙", "그래프", "DP",
                "스택", "", "", "", "",
                "큐"};
        QuizService service = new QuizServiceImpl();
        while (true){
            System.out.println("[MENU] 0.EXIT\n" +
                    "1.팀별 과제를  출력하세요.\n" +
                    "2. 팀장이 맡은 과제만 출력하세요\n" +
                    "3. 입력한 과목의 인덱스를 출력하세요.\n" +
                    "4. 팀원별 과제 수를 출력하세요 예) 홍정명(4개), 전종현(2개), 노홍주(2개), 양정오(2개), 정경준(2개)\n");
            switch (scanner.next()){
                case "0" : System.out.println("시스템 종료");return;
                case "1" : quiz1(arr); break;
                case "2" : quiz2(arr); break;
                case "3" : quiz3(arr); break;
                case "4" : quiz4(arr); break;
            }
        }
    }
    private static void quiz4(String[] arr) {
        String s;
        System.out.println("팀원별 과제 수를 출력하세요 예) 홍정명(4개), 전종현(2개), 노홍주(2개), 양정오(2개), 정경준(2개)");
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        s = "";
        for (int i = 0; i < arr.length; i++){
            int a = i % 5;
            for (int j = 0; j<5; j++){
                if(a==j){
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for (int i = 0; i<5; i++){
            System.out.println(arr[i] + resArr[i] + "\n");
        }
    }


    private static void quiz3(String[] arr) {
        String s = "";
        s = "";
        System.out.println("입력한 과목의 인덱스를 추출하세요.");
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("탐욕법")) {
                s += arr[i] + "의 담당자는" + arr[i % 5];
            }
        System.out.println(s);
    }


    private static void quiz2(String[] arr) {
        String s;
        System.out.println("팀장이 맡은 과제만 출력하세요");
        s = "";
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("홍정명")) {
                for (int j = 0; j < 5; j++) {
                    s += arr[i + j * 5] + ",";
                }
            }
        System.out.println(s);
    }

    private static void quiz1(String[] arr) {
        System.out.println("팀별 과제를  출력하세요.");
        String s;
        s = "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
    }
}
