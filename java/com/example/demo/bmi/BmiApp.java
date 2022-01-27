package com.example.demo.bmi;

import java.util.Scanner;

/**
 * packageName: com.example.demo.bmi
 * fileName     : BmiApp
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class BmiApp {
   public static String BmiApp = "bmi";
   private String name;
   private String cm;
   private String kg;
   public String getbmi(String name, String cm, String kg){
      this.name = name;
      this.cm = cm;
      this.kg = kg;
      String res = String.format("%s 정상",this.name,this.cm,this.kg);
      return res;
   }
}
