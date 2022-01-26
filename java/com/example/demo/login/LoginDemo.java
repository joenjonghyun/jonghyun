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
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LoginApp loginApp = new LoginApp();
        System.out.println(LoginApp.LoginApp);
        System.out.println("아이디");
        String id = scanner.next();
        System.out.println("패스워드");
        String pw = scanner.next();
        System.out.println("이름");
        String name = scanner.next();
        String result = loginApp.login(id, pw, name);
        System.out.println(result);
    }
}
