package com.example.demo.service;

import com.example.demo.domain.CalcDTO;

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
public class CalcService {
    public String getCalc(CalcDTO calc) {
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
}