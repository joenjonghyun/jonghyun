package com.example.demo.member.domain;

/**
 * packageName: com.example.demo.google
 * fileName     : GoogleApp
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class GoogleDTO {
    public static String GOOGLEAPP = "google";
    private String url;

    public String getUrl(){
        return url;
    }
    public void setUrl(String url){
        this.url = url;
    }
    public String getgoogle(){
        String res = String.format("%s 검색결과",this.url);
        return res;
    }
}
