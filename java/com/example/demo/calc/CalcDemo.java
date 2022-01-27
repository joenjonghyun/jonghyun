package com.example.demo.calc;

import java.util.Scanner;

/**
 * packageName: com.example.demo.calc
 * fileName     : CalcDemo
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class CalcDemo {
    public String execute(int num1, String opcode, int num2) {
        CalcApp calcApp = new CalcApp();
        return calcApp.getcalc(num1, opcode, num2);


    }
}