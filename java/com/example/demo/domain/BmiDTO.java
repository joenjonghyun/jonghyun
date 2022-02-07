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
   private double tall;
   private double weight;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public double getTall() {
      return tall;
   }

   public void setTall(double tall) {
      this.tall = tall;
   }

   public double getWeight() {
      return weight;
   }

   public void setWeight(double weight) {
      this.weight = weight;
   }
}
