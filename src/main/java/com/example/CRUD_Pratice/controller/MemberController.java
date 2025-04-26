package com.example.CRUD_Pratice.controller;

import com.example.CRUD_Pratice.dto.MemberForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MemberController {

    @GetMapping("/signup")
    public String newMemberForm() {
        return "articles/new";
    }

    @PostMapping("/join")
    public String joinMember(MemberForm form) {
        System.out.println(form.toString());
        return "";
    }

}
