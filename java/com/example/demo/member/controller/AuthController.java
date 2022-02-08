package com.example.demo.member.controller;

import com.example.demo.member.domain.BmiDTO;
import com.example.demo.member.domain.CalcDTO;
import com.example.demo.member.domain.GoogleDTO;
import com.example.demo.member.domain.GradeDTO;
import com.example.demo.member.domain.LoginDTO;
import com.example.demo.member.service.StudentService;
import com.example.demo.member.service.StudentServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName     : DemoController
 * author       : 전종현
 * date         : 2022-01-27
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27        전종현       최초 생성
 */
public class AuthController {
    public void execute(Scanner scanner) {
        BmiDTO bmi = new BmiDTO();
        CalcDTO calc = new CalcDTO();
        GoogleDTO google = new GoogleDTO();
        GradeDTO grade = new GradeDTO();
        LoginDTO login = new LoginDTO();
        StudentService service = new StudentServiceImpl();
        while(true){
            System.out.println("메뉴 선택");
            String menu = "0=EXIT 1.BMI 2.CALC 3.GOOGLE 4.GRADE 5.LOGIN";
            System.out.println(menu);
            String select = scanner.next();
            String result = "";
            switch (select){
                case "0" :
                    System.out.println("Exit"); return;
                case "1" : result = "BMI";
                    System.out.println(BmiDTO.BmiApp+("\n이름, 키, 몸무게"));
                    bmi.setName(scanner.next());
                    bmi.setTall(scanner.nextDouble());
                    bmi.setWeight(scanner.nextDouble());
                    result = service.getbmi(bmi);
                break;
                case "2" : result = "CALC";
                    System.out.println(CalcDTO.CLACAPP+("\n숫자1, 연산자, 숫자2 입력"));
                    calc.setNum1(scanner.nextInt());
                    calc.setOpcode(scanner.next());
                    calc.setNum2(scanner.nextInt());
                    result = service.calc(calc);
                    break;
                case "3" : result = "GOOGLE";
                    System.out.println(GoogleDTO.GOOGLEAPP+("\n검색어"));
                    google.setUrl(scanner.next());
                    result = service.search(google);
                break;
                case "4" : result = "GRADE";
                    System.out.println(GradeDTO.GRADEAPP+("\n이름, 국어, 영어, 수학"));
                    grade.setName(scanner.next());
                    grade.setKor(scanner.nextInt());
                    grade.setEng(scanner.nextInt());
                    grade.setMath(scanner.nextInt());
                    result = service.grade(grade);
                break;
                case "5" : result = "LOGIN";
                    System.out.println(LoginDTO.LoginApp+("\n아이디, 비밀번호, 이름"));
                    login.setId(scanner.next());
                    login.setPw(scanner.next());
                    login.setName(scanner.next());
                    result = service.login(login);
                break;
                default  : result = "WRONG"; break;
            }
            System.out.println(result);
         }
        }
    }

