package com.example.demo.member.service;

import com.example.demo.member.domain.*;

import static com.example.demo.member.domain.GradeDTO.GRADEAPP;
import static com.example.demo.member.domain.UserDTO.PASSWARD;

/**
 * packageName: com.example.demo.service
 * fileName     : StudentServiceImpl
 * author       : 전종현
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        전종현       최초 생성
 */
public class MemberServiceImpl implements MemberService {


    /**
     *  BMI = w / t * t
     *  고도 비만 : 35 이상
     * 중(重)도 비만 (2단계 비만) : 30 - 34.9
     * 경도 비만 (1단계 비만) : 25 - 29.9
     * 과체중 : 23 - 24.9
     * 정상 : 18.5 - 22.9
     * 저체중 : 18.5 미만
     * */
    @Override
    public String getbmi(BmiDTO param) {
        double BMI = param.getWeight() / (param.getTall() * param.getTall()) * 10000;
       /* String s = "";
        if(){
            s = "고도비만";
        }else{}
        if(){
            s = "중(重)도 비만 (2단계 비만)";
        }else{}
        if(){
            s = "경도 비만 (1단계 비만)";
        }else{}
        if(){
            s = "과체중";
        }else{}
        if(){
            s = "정상";
        }else{}
        if(){
            s = "저체중";
        }else{}
        return s;*/
        return String.format("%s정상",param.getName());
    }

    @Override
    public String calc(CalcDTO calc) {
        String result = "";
        switch (calc.getOpcode()) {
            case "+":
                result = String.format("%d + %d = %d", calc.getNum1(), calc.getNum2(), calc.getNum1() + calc.getNum2());
                break;
            case "-":
                result = String.format("%d - %d = %d", calc.getNum1(), calc.getNum2(), calc.getNum1() - calc.getNum2());
                break;
            case "*":
                result = String.format("%d * %d = %d", calc.getNum1(), calc.getNum2(), calc.getNum1() * calc.getNum2());
                break;
            case "/":
                result = String.format("%d / %d = %d", calc.getNum1(), calc.getNum2(), calc.getNum1() / calc.getNum2());
                break;
        }
        return result;
    }

    @Override
    public String search(GoogleDTO google) {
        String res = String.format("%s 검색결과",google.getUrl());
        return google.getgoogle();
    }

    @Override
    public String grade(GradeDTO grade) {
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

    @Override
    public String login(UserDTO login) {
        String res;
        res = (login.getPw().equals(PASSWARD)) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패", login.getId(), login.getPw());
        return login.getlogin();
    }
}
