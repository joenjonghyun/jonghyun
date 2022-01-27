package com.example.demo.controller;

import com.example.demo.bmi.BmiApp;
import com.example.demo.bmi.BmiDemo;
import com.example.demo.calc.CalcApp;
import com.example.demo.calc.CalcDemo;
import com.example.demo.google.GoogleApp;
import com.example.demo.google.GoogleDemo;
import com.example.demo.grade.GradeApp;
import com.example.demo.grade.GradeDemo;
import com.example.demo.login.LoginApp;
import com.example.demo.login.LoginDemo;

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
public class DemoController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcDemo calcDemo = new CalcDemo();
        BmiDemo bmiDemo = new BmiDemo();
        GoogleDemo googleDemo = new GoogleDemo();
        GradeDemo gradeDemo = new GradeDemo();
        LoginDemo loginDemo = new LoginDemo();
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
                    System.out.println(BmiApp.BmiApp+("\n이름, 키, 몸무게"));
                    result = bmiDemo.execute(scanner.next(), scanner.next(), scanner.next());
                break;
                case "2" : result = "CALC";
                    System.out.println(CalcApp.CLACAPP+("\n숫자1, 연산자, 숫자2 입력"));
                    result = calcDemo.execute(scanner.nextInt(),scanner.next(),scanner.nextInt());
                    break;
                case "3" : result = "GOOGLE";
                    System.out.println(GoogleApp.GOOGLEAPP+("\n검색어"));
                    result = googleDemo.execute(scanner.next());
                break;
                case "4" : result = "GRADE";
                    System.out.println(GradeApp.GRADEAPP+("\n이름, 국어, 영어, 수학"));
                    result = gradeDemo.execute(scanner.next(),scanner.nextInt(),scanner.nextInt(),scanner.nextInt());
                break;
                case "5" : result = "LOGIN";
                    System.out.println(LoginApp.LoginApp+("\n아이디, 비밀번호, 이름"));
                    result = loginDemo.execute(scanner.next(), scanner.next(), scanner.next());
                break;
                default  : result = "WRONG"; break;
            }
            System.out.println(result);
         }
        }
        /*if(select.equals("1")){
            System.out.println("BMI");}
        if(select.equals("2")){
            System.out.println("CALC");}
        if(select.equals("3")){
            System.out.println("SEARCH");}
        if(select.equals("4")){
            System.out.println("GRADE");}
        if(select.equals("5")){
            System.out.println("LOGIN");}*/
    }

