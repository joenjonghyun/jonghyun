package com.example.demo.service;

import com.example.demo.domain.GoogleDTO;

/**
 * packageName: com.example.demo.google
 * fileName     : GoogleDemo
 * author       : 전종현
 * date         : 2022-01-25
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-01-25        전종현       최초 생성
 */
public class GoogleService {
    public String getGoogle(GoogleDTO google) {
        String res = String.format("%s 검색결과",google.getUrl());
        return google.getgoogle();
    }
}
