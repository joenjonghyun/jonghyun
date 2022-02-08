package com.example.demo.algorithm.controller;

import java.util.Scanner;

/**
 * packageName: com.example.demo.algorithm.controller
 * fileName     : AlgorithmController
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public class AlgorithmController {
    public void execute(Scanner scanner){
        while (true){
            System.out.println("[담당] 0.종료 1.홍정명");
            switch (scanner.next()){
                case "0" :
                    System.out.println("Exit");return;
                case "1" :
                    System.out.println("홍정명");
            }
        }
    }
}
