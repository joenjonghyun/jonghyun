package com.example.demo.oop.controller;

import com.example.demo.oop.service.PhoneService;
import com.example.demo.oop.service.PhoneServiceImpl;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName     : PhoneController
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public class OopController {
    public void execute(Scanner scanner) {
        PhoneService service = new PhoneServiceImpl();
        while(true){
            System.out.println("메뉴\n" +
                    " 0.메뉴 나가기 " +
                    " 1.집전화 " +
                    " 2.휴대폰 " +
                    " 3.아이폰 " +
                    " 4.갤럭시노트 ");
            switch (scanner.next()){
                case "0" :
                    System.out.println("0.메뉴 나가기");
                    return;
                case "1" :
                   service.usePhone(scanner);
                    break;
                case "2" :
                    service.useCelPhone(scanner);
                    break;
                case "3" :
                   service.useIPhone(scanner);
                    break;
                case "4" :service.useGalPhone(scanner);
                    break;
                default:
                    System.out.println("Wrong Number");
                    break;
            }
        }
    }
}
