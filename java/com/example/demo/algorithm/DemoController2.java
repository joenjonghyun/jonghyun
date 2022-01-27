package com.example.demo.algorithm;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName     : DemoController2
 * author       : 전종현
 * date         : 2022-01-27
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-27        전종현       최초 생성
 */
public class DemoController2 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        while (true){
            System.out.println("[메뉴] 0.Exit\n" +
                    "1. stack \t" +
                    "2. queue \t" +
                    "3. heap \t" +
                    "4. hash \t" +
                    "5. sort \t" +
                    "6. gsf \t" +
                    "7. dfs \t" +
                    "8. bfs \t" +
                    "9. dp \t" +
                    "10. graph \t" +
                    "11. bin search \t" +
                    "12. gready \t");
            switch (scanner.next()){
                case "0" : return;
                case "1" : break;
                default:
                    System.out.println("WORNG NUMBER");
            }
        }
    }
}

