package com.example.CRUD_Pratice.controller;


import org.springframework.ui.Model;
import com.example.CRUD_Pratice.dto.MemberForm;
import com.example.CRUD_Pratice.entity.Member;
import com.example.CRUD_Pratice.repository.MemberRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "redirect:/signup/"+ saved.getId();
    }
    @GetMapping("/signup/{id}")
    public String show(@PathVariable Long id, Model model) {
        Member memberEntity = MemberRepository.findById(id).orElse(null);
        model.addAttribute("members", memberEntity);
        return "articles/show";
    }

    @GetMapping("/members")
    public String index(Model model) {
        Iterable<Member> members = MemberRepository.findAll();
        model.addAttribute("member", members);
        return "articles/index";
    }

    @GetMapping("/members/{id}/edit")
    public String edit(@PathVariable Long id, Model model) {
        Member memberEntity = MemberRepository.findById(id).orElse(null);
        model.addAttribute("member", memberEntity);
        return "articles/edit";
    }
}
