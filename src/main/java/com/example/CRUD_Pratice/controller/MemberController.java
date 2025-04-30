package com.example.CRUD_Pratice.controller;


import com.example.CRUD_Pratice.dto.MemberForm;
import com.example.CRUD_Pratice.entity.Member;
import com.example.CRUD_Pratice.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class MemberController {
    @Autowired
    private MemberRepository MemberRepository;

    @GetMapping("/signup")
    public String newMemberForm() {
        return "articles/new";
    }

    @PostMapping("/join")
    public String joinMember(MemberForm form) {
        log.info(form.toString());

        Member member = form.toEntity();
        log.info(member.toString());

        Member saved= MemberRepository.save(member);
        log.info(saved.toString());
        return "";
    }

}
