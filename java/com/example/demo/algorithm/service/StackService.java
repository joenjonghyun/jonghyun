package com.example.demo.algorithm.service;

/**
 * packageName: com.example.demo.algorithm.service
 * fileName     : StackService
 * author       : 전종현
 * date         : 2022-02-08
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-08        전종현       최초 생성
 */
public interface StackService {
    int[] devFunction(int[] progresses, int[] speeds);
    int printer(int[] priorities, int location);
    int crossTruck(int bridge_length, int weight, int[] truck_weights);
    int[] stockPrice(int[] prices);
}
