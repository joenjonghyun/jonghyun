package com.example.demo.oop.controller;

import com.example.demo.oop.domain.CelPhone;
import com.example.demo.oop.domain.GalPhone;
import com.example.demo.oop.domain.IPhone;
import com.example.demo.oop.domain.Phone;
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
        while(true){
            System.out.println(" 메뉴\n " +
                    " 0. 메뉴 나가기 \n " +
                    " 1. 은닉화(Encapsulation)\n " +
                    " 2. 상속(Inheritance)\n " +
                    " 3. 추상화(Abstraction)\n " +
                    " 4. 다형성 (Polymorphism)\n " ); //4가지 중 하나라도 충족하지 못 하면 oop의 컨셉이 아님
            switch (scanner.next()){
                case "0" :
                    System.out.println("0.메뉴 나가기");
                    return;
                case "1" :
                    System.out.println("POJO가 은닉화다.");
                    break;
                case "2" :
                    System.out.println("extends가 상속이다.");
                    Phone phone = new Phone("금성전화기" , "금성전자 ");
                    CelPhone celPhone = new CelPhone("벽돌전화","애니콜","이동중");
                    IPhone iPhone = new IPhone("애플");
                    GalPhone galPhone = new GalPhone("삼성");
                    PhoneService service = new PhoneServiceImpl();
                    PhoneService phoneService = new PhoneServiceImpl();
                    System.out.println("[소메뉴] | 0. 나가기 | 1. 집전화 | 2. 휴대폰 | 3.아이폰 | 4.갤럭시폰 | ");
                    switch (scanner.next()){
                        case "0" :
                            System.out.println("exit");return;
                        case "1" :
                            phone.setCall("통화");
                            phoneService.usePhone(phone);
                            break;
                        case "2" :
                                celPhone.setCall("여보세요");
                                phoneService.useCelPhone(celPhone);
                                break;
                        case "3" :
                            iPhone.setCall("통화");
                            iPhone.setSearch("뉴스");
                            phoneService.useIPhone(iPhone);
                            break;
                        case "4" :
                            galPhone.setCall("통화");
                            galPhone.setSearch("검색");
                            galPhone.setPay("페이");
                            phoneService.useGalPhone(galPhone);
                            break;

                    }


            }
        }
    }
}
