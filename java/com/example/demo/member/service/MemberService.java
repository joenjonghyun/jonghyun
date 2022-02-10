package com.example.demo.member.service;

import com.example.demo.member.domain.*;

/**
 * packageName: com.example.demo.service
 * fileName     : StudentService
 * author       : 전종현
 * date         : 2022-02-07
 * desc         :
 * ================================
 * DATE              AUTHOR        NOTE
 * ================================
 * 2022-02-07        전종현       최초 생성
 */
public interface MemberService {
    String getbmi(BmiDTO bmi);
    String calc(CalcDTO calc);
    String search(GoogleDTO google);
    String grade(GradeDTO grade);
    String login(UserDTO login);
}
