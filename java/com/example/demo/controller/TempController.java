package com.example.demo.controller;

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
public class TempController {
    public static void main(String[] args) {
        String[] arr = {"홍정명", "전종현", "노홍주", "양정오", "정경준",
                "깊이", "탐욕법", "정렬", "이분탐색", "완전탐색",
                "너비우선탐색", "해시", "힙", "그래프", "DP",
                "스택", "", "", "", "",
                "큐"};
        Scanner scanner = new Scanner(System.in);
        while (true){
            switch (scanner.next()){
                case "0" : System.out.println("시스템 종료"); return;
                case "1" : quiz1(arr); break;
                case "2" : quiz2(arr); break;
                case "3" : quiz3(arr); break;
                case "4" : quiz4(arr); break;
                case "5" : quiz5(arr); break;
            }
        }
    }
    private static void quiz5(String[] arr) {
        String s;
        System.out.println("팀원별 과제 수를 출력하세요 예) 홍정명(4개), 전종현(2개), 노홍주(2개), 양정오(2개), 정경준(2개)");
        s = "";
        int count = 0;
        String countManager = "";
        countManager += arr[0] + "(4개)";
        countManager += arr[1] + "(2개)";
        countManager += arr[2] + "(2개)";
        countManager += arr[3] + "(2개)";
        countManager += arr[4] + "(2개)";
        countManager = "";
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        for (int i = 0; i < arr.length; i++){
            if (arr[i].equals(arr[5])){
                count0++;}
            if (arr[i].equals(arr[6])){
                count1++;}
            if (arr[i].equals(arr[7])){
                count2++;}
            if (arr[i].equals(arr[8])){
                count3++;}
            if (arr[i].equals(arr[9])){
                count4++;}
            countManager += arr[i] + "(4개)" +"\n";
        }
        System.out.println(arr[0]+"의 카운트는"+count0);
        System.out.println(arr[1]+"의 카운트는"+count1);
        System.out.println(arr[2]+"의 카운트는"+count2);
        System.out.println(arr[3]+"의 카운트는"+count3);
        System.out.println(arr[4]+"의 카운트는"+count4);

        System.out.println(countManager);
    }


    private static void quiz4(String[] arr) {
        String s = "";
        s = "";
        System.out.println("입력한 과목의 인덱스를 추출하세요.");
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("탐욕법")) {
                s += arr[i] + "의 담당자는" + arr[i % 5];
            }
        System.out.println(s);
    }

    private static void quiz3(String[] arr) {
        String s = "";
        s = "";
        System.out.println("큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람 : 홍정명");
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("큐")) {
                s += arr[i] + "를 담당한 사람 : " + arr[0];
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
        String s = "";
        s= "";
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
    }
}




