package com.example.demo.naver;

/**
 * packageName: com.example.demo.naver
 * fileName     : NaverApp
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class NaverApp {
   public static String NAVERAPP = "naver";
   private String url;
   public String naver(String url){
       this.url = url;
       String res = String.format("%s 검색어",this.url);
       return res;

   }
}
