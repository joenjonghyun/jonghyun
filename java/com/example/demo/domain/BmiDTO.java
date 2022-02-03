package com.example.demo.domain;

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
public class BmiDTO {
   public static String BmiApp = "bmi";
   private String name;
   private String cm;
   private String kg;

   public String getName(){
      return name;
   }
   public void setName(String name){
      this.name = name;
   }
   public String getCm(){
      return cm;
   }
   public void setCm(String cm){
      this.cm = cm;
   }
   public String getKg(){
      return kg;
   }
   public void setKg(String kg){
      this.kg = kg;
   }

   public String getBmi(){
      String res = String.format("%s 정상",this.name,this.cm,this.kg);
      return res;
   }
}
