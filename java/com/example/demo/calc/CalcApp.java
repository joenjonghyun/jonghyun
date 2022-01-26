package com.example.demo.calc;

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
public class CalcApp {
    public static String CLACAPP = "calc";
    private int num1;
    private String opcode;
    private int num2;

    String calc(int num1, String opcode, int num2) {
        this.num1 = num1;
        this.opcode = opcode;
        this.num2 = num2;
        String result = "";
        /*
        if(opcode.equals("+")){result=String.format("%d + %d = %d", this.num1, this.num2, this.num1 + this.num2);}
        if(opcode.equals("-")){result=String.format("%d - %d = %d", this.num1, this.num2, this.num1 - this.num2);}
        if(opcode.equals("*")){result=String.format("%d * %d = %d", this.num1, this.num2, this.num1 * this.num2);}
        if(opcode.equals("/")){result=String.format("%d / %d = %d", this.num1, this.num2, this.num1 / this.num2);}*/

        switch(opcode){
            case "+" : result=String.format("%d + %d = %d", this.num1, this.num2, this.num1 + this.num2); break;
            case "-" : result=String.format("%d - %d = %d", this.num1, this.num2, this.num1 - this.num2); break;
            case "*" : result=String.format("%d * %d = %d", this.num1, this.num2, this.num1 * this.num2); break;
            case "/" : result=String.format("%d / %d = %d", this.num1, this.num2, this.num1 / this.num2); break;
        }
        return result;
    }


}
