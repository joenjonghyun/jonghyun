package com.example.demo.login;

import java.util.Scanner;

/**
 * packageName: com.example.demo.login
 * fileName     : LoginDemo
 * author       : 전종현
 * date         : 2022-01-26
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26        전종현       최초 생성
 */
public class LoginDemo {
    public String execute(String id, String pw, String name) {
        LoginApp loginApp = new LoginApp();
        return loginApp.getlogin(id, pw, name);
    }
}
