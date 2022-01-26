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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcApp calcApp = new CalcApp();
        System.out.println(CalcApp.CLACAPP);
        int num1 = scanner.nextInt();
        String opcode = scanner.next();
        int num2 = scanner.nextInt();
        String result = calcApp.calc(num1, opcode, num2);
        System.out.println(result);


    }
}