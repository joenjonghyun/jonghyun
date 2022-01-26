package com.example.demo.grade;

import java.util.Scanner;

/**
 * packageName: com.example.demo.grade
 * fileName     : GradeDemo
 * author       : 전종현
 * date         : 2022-01-26
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26        전종현       최초 생성
 */
public class GradeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GradeApp gradeApp = new GradeApp();
        System.out.println("이름을 입력해주세요.");
        String name = scanner.next();
        System.out.println("국어 점수를 입력해주세요.");
        int kor = scanner.nextInt();
        System.out.println("영어 점수를 입력해주세요.");
        int eng = scanner.nextInt();
        System.out.println("수학 점수를 입력해주세요.");
        int math = scanner.nextInt();
        String res = gradeApp.getGrade(name, kor, eng, math);
        System.out.println(res);
    }
}

