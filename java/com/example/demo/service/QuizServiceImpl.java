package com.example.demo.service;

/**
 * packageName: com.example.demo.service
 * fileName     : QuizService
 * author       : 전종현
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        전종현       최초 생성
 */
public class QuizServiceImpl implements QuizService {
    @Override
    public void quiz4(String[] arr) {
        String s;
        System.out.println("팀원별 과제 수를 출력하세요 예) 홍정명(4개), 전종현(2개), 노홍주(2개), 양정오(2개), 정경준(2개)");
        int[] intArr = new int[5];
        s = "";
        for (int i = 0; i < arr.length; i++){
           int a = i % 5;
           for (int j = 0; j<5; j++){
               if(j==0){
                   intArr[0]++;
               }
           }
           if(a ==0){
               intArr[0]++;
           }
           if (a == 1){
               intArr[1]++;
           }
           if (a == 2){
               intArr[2]++;
           }
           if (a == 3){
               intArr[3]++;
           }
           if (a == 4){
               intArr[4]++;
           }
            s += arr[i] + "(4개)" +"\n";
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
    }
