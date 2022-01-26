package com.example.demo.login;

/**
 * packageName: com.example.demo.login
 * fileName     : LoginApp
 * author       : 전종현
 * date         : 2022-01-26
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-26        전종현       최초 생성
 */
public class LoginApp {
    public static String LoginApp = "login";
    private String id;
    private String pw;
    private String name;
    static String PASSWARD = "abc";
    public String login(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
        String res = "";
        /*
        if(pw.equals(PASSWARD)){
            res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공",this.name, this.pw);
        }else {
            res = String.format("%s 님의 아이디는 맞고 비번 %s 가 틀립니다. 로그인 실패",this.id, this.pw);
        }*/
        /*switch (pw){
            case "abc" : res = String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공",this.name, this.pw);break;
            default : res = String.format("%s 님의 아이디는 맞고 비번 %s 가 틀립니다. 로그인 실패",this.id, this.pw);
        }*/
        res = (pw.equals(PASSWARD)) ? String.format("%s 님의 비번 %s 가 맞습니다. 로그인 성공", this.name, this.pw)
                : String.format("%s 의 ID 는 맞고, 비번 %s 가 틀립니다. 로그인 실패", this.id, this.pw);


        return res;
    }
}
