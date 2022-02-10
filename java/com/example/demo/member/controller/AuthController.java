package com.example.demo.member.controller;

import com.example.demo.member.domain.BmiDTO;
import com.example.demo.member.domain.CalcDTO;
import com.example.demo.member.domain.GoogleDTO;
import com.example.demo.member.domain.GradeDTO;
import com.example.demo.member.domain.UserDTO;
import com.example.demo.member.service.MemberService;
import com.example.demo.member.service.MemberServiceImpl;

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
        UserDTO login = new UserDTO();
        MemberService service = new MemberServiceImpl();
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
                    BmiDTO b = BmiDTO.getInstance();
                    b.setName(scanner.next());
                    b.setTall(scanner.nextDouble());
                    b.setWeight(scanner.nextDouble());
                    result = service.getbmi(b);
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
                    GradeDTO g = GradeDTO.getInstance();
                    g.setName(scanner.next());
                    g.setKor(scanner.nextInt());
                    g.setEng(scanner.nextInt());
                    g.setMath(scanner.nextInt());
                    result = service.grade(g);
                break;
                case "5" : result = "LOGIN";
                    System.out.println(UserDTO.LoginApp+("\n아이디, 비밀번호, 이름"));
                    UserDTO u = UserDTO.getInstance();
                    u.setId(scanner.next());
                    u.setPw(scanner.next());
                    u.setName(scanner.next());
                    result = service.login(u);
                break;
                default  : result = "WRONG"; break;
            }
            System.out.println(result);
         }
        }
    }

