package com.example.demo.quiz.service;

/**
 * packageName: com.example.demo.quiz.service
 * fileName     : Feb06ServiceImpl
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public class Feb06ServiceImpl implements Feb06Service {
    @Override
    public void quiz1(String[] arr) {
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

    @Override
    public void quiz2(String[] arr) {
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

    @Override
    public void quiz3(String[] arr) {
        String s = "";
        s = "";
        System.out.println("입력한 과목의 인덱스를 추출하세요.");
        for (int i = 0; i < arr.length; i++)
            if (arr[i].equals("탐욕법")) {
                s += arr[i] + "의 담당자는" + arr[i % 5];
            }
        System.out.println(s);
    }

    @Override
    public void quiz4(String[] arr) {
        String s;
        System.out.println("팀원별 과제 수를 출력하세요 예) 홍정명(4개), 전종현(2개), 노홍주(2개), 양정오(2개), 정경준(2개)");
        int[] intArr = new int[5];
        int[] resArr = new int[5];
        s = "";
        for (int i = 0; i < arr.length; i++) {
            int a = i % 5;
            for (int j = 0; j < 5; j++) {
                if (a == j) {
                    intArr[j]++;
                }
                resArr = intArr;
            }
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(arr[i] + resArr[i] + "\n");
        }
    }
}