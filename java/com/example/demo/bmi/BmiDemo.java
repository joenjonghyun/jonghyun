package com.example.demo.bmi;

import com.example.demo.kakao.KakaoApp;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName     : BmiDemo
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class BmiDemo {
    public String execute(String name, String cm, String kg) {
        BmiApp bmiApp = new BmiApp();
        return bmiApp.getbmi(name,cm,kg);
    }
}
