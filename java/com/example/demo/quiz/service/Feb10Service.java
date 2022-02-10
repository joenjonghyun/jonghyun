package com.example.demo.quiz.service;

import java.util.Scanner;

/**
 * packageName: com.example.demo.quiz.service
 * fileName     : Feb10Service
 * author       : 전종현
 * date         : 2022-02-10
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-10        전종현       최초 생성
 *    // 아래 문제들은 모두 스캐너 없이 , Math랜덤으로 처리합니다
 */
public interface Feb10Service {
    void bubbleSort(Scanner scanner);
    void insertionSort(Scanner scanner);
    void selectionSort(Scanner scanner);
    void quickSort(Scanner scanner);
    void mergeSort(Scanner scanner);
    void magicSquare(Scanner scanner);
    void zigzag(Scanner scanner);
    void rectangleStarPrint(Scanner scanner);
    void triangleStarPrint(Scanner scanner);
}
