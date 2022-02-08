package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName     : DfsService
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public interface DfsService {
    int fact(int n);
    int targetNumber(int[] numbers, int target);
    int network(int n, int[][] computers);
    int transWord(String begin, String target, String[] words);
    String[] travelRoute(String[][] tickets);
}
