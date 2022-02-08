package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName     : HeapService
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public interface HeapService {
    int spicier(int[] scoville, int K);
    int disk(int[][] jobs);
    int[] priority(String[] operations);
}
