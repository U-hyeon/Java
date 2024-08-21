package com.example.demo.controller;

import com.example.demo.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {
/*
    // 필드주입
    @Autowired private final MemberService memberService;
*/
/*
    // setter를 통한 주입. setter injection
    private MemberService memberService; // final이 아님

    @Autowired
    public void setMemberService(MemberService memberService) {
        this.memberService = memberService;
    }
 */
    private final MemberService memberService;

    // 생성자주입 (권장)
    @Autowired
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
