package com.example.demo.controller;

import com.example.demo.domain.GradeDTO;

import java.util.Scanner;

/**
 * packageName: com.example.demo.controller
 * fileName     : TempController
 * author       : 전종현
 * date         : 2022-02-03
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-03        전종현       최초 생성
 */
public class TempController {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] arr = {     "홍정명",        "전종현",    "노홍주",    "양정오",     "정경준",
                             "깊이",         "탐욕법",    "정렬",     "이분탐색",   "완전탐색",
                              "너비우선탐색",   "해시" ,     "힙",      "그래프",       "DP",
                               "스택",        "",          "",         "",            "",
                                "큐",           "",          "",       "",         "",};
        for (int i = 0; i<5; i++){
            System.out.println(arr[i]+":"+arr[i+5]+","+arr[i+10]+","+arr[i+15]+","+arr[i+20]);
        }
        }
    }

