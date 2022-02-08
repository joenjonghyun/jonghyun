package com.example.demo.oop.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName     : PhoneServiceImpl
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public class PhoneServiceImpl implements PhoneService {
    @Override
    public void usePhone(Scanner scanner) {
        System.out.println("1. 집전화");

    }

    @Override
    public void useCelPhone(Scanner scanner) {
        System.out.println("2. 휴대폰");

    }

    @Override
    public void useIPhone(Scanner scanner) {
        System.out.println("3. 아이폰");

    }

    @Override
    public void useGalPhone(Scanner scanner) {
        System.out.println("4. 갤럭시노트");

    }
}
