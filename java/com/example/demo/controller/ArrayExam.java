package com.example.demo.controller;

/*package com.example.demo.controller;

/**
 * packageName: com.example.demo.controller
 * fileName     : ArrayExam
 * author       : 전종현
 * date         : 2022-02-04
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-04        전종현       최초 생성
 */
public class ArrayExam {
    public static void main(String[] args) {
        String[] arr = Quiz1();
        String s = "";
        System.out.println("팀장이 맡은 과제만 출력하세요");
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i].equals("홍정명")){
                for (int j = 0 ; j< 5; j++){
                s += arr[i + j * 5] + ",";}
            }
        }
        System.out.println(s);
        System.out.println("큐를 담당한 사람을 출력하세요. 예) 큐를 담당한 사람 : 홍정명");
        s = "";
        for (int i = 0 ; i < arr.length; i++){
            if (arr[i].equals("큐")){
                s += arr[i] + "를 담당한 사람 : " + arr[0];
            }
        }
        System.out.println(s);
        System.out.println("입력한 과목의 인덱스를 추출하세요. 예) ~의 담당자 누구");
        s = "";
        for (int i = 0; i < arr.length; i++){
            if(arr[i].equals("탐욕법")){
                s+= arr[i] + "의 담당자 : " + arr[i % 5];
            }
        }
        System.out.println(s);
    }

    private static String[] Quiz1() {
        System.out.println("팀별 과제를  출력하세요.");
        String[] arr = {"홍정명", "전종현", "노홍주", "양정오", "정경준",
                "깊이", "탐욕법", "정렬", "이분탐색", "완전탐색",
                "너비우선탐색", "해시", "힙", "그래프", "DP",
                "스택", "", "", "", "",
                "큐"};
        String s = "";
        for (int i = 0; i < arr.length; i++){
            if(i % 5 == 0){
                s += "\n";
            }
            s += i + ":" + arr[i] + "\t";
        }
        System.out.println(s);
        return arr;
    }

}
