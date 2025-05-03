package com.example.CRUD_Practice.dto;

import com.example.CRUD_Practice.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class MemberForm {
    private Long id;
    private String email;
    private String password;

    public Member toEntity() {
        return new Member(id,email,password);
    }

    }


