package com.example.demo.member.domain;

/**
 * packageName: com.example.demo.calc
 * fileName     : CalcApp
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class CalcDTO {
    public static String CLACAPP = "계산기";
    private int num1;
    private String opcode;
    private int num2;


    public int getNum1(){ return num1; }
    public void setNum1(int num1){this.num1 = num1;}
    public String getOpcode(){return opcode;}
    public void setOpcode(String opcode){this.opcode = opcode;}
    public int getNum2(){return num2;}
    public void setNum2(int num2){this.num2 = num2;}

    String getcalc() {
        String result = "";
        switch(opcode){
            case "+" : result=String.format("%d + %d = %d", this.num1, this.num2, this.num1 + this.num2); break;
            case "-" : result=String.format("%d - %d = %d", this.num1, this.num2, this.num1 - this.num2); break;
            case "*" : result=String.format("%d * %d = %d", this.num1, this.num2, this.num1 * this.num2); break;
            case "/" : result=String.format("%d / %d = %d", this.num1, this.num2, this.num1 / this.num2); break;
        }
        return result;
    }


}
