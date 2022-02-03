package com.example.demo.service;

import com.example.demo.domain.GradeDTO;

import static com.example.demo.domain.GradeDTO.GRADEAPP;

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
public class GradeService {
    public String getGrade(GradeDTO grade){
        System.out.println("GradeService 에 들어옴");
        System.out.println(grade.toString());
        int total=grade.getKor() + grade.getEng() + grade.getMath();
        int avg = total / 3;
        String res = (avg >= 60) ? "합격" : "불합격";

    return String.format(" * ########## %s ########\n" +
                " * 이름: %s\n" +
                " * > 국어: %d점\n" +
                " * > 영어: %d점\n" +
                " * > 수학: %d점\n" +
                " * 총점: %d점\n" +
                " * 평균(점수): %d점\n" +
                " * 합격여부: %s\n" +
                " * #######################", GRADEAPP, grade.getName(), grade.getKor(), grade.getEng(), grade.getMath(), total, avg, res);
    }
}