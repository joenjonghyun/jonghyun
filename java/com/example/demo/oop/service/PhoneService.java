package com.example.demo.oop.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.service
 * fileName     : PhoneService
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public interface PhoneService {
    void usePhone(Scanner scanner);
    void useCelPhone(Scanner scanner);
    void useIPhone(Scanner scanner);
    void useGalPhone(Scanner scanner);
}
