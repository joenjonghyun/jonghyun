package com.example.demo.google;

import com.example.demo.naver.NaverApp;

import java.util.Scanner;

/**
 * packageName: com.example.demo.google
 * fileName     : GoogleDemo
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class GoogleDemo {
    public String execute(String url) {
        GoogleApp googleApp = new GoogleApp();
        return googleApp.getgoogle(url);
    }
}
