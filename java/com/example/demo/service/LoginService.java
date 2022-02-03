package com.example.demo.service;

import com.example.demo.domain.LoginDTO;

import static com.example.demo.domain.LoginDTO.PASSWARD;

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
public class LoginService {
    public String getLogin(LoginDTO login){
        String res;
        res = (login.getPw().equals(PASSWARD)) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", login.getName(), login.getPw())
                : String.format("%s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패", login.getId(), login.getPw());
        return login.getlogin();
    }
}
