package com.example.CRUD_Pratice.dto;

import com.example.CRUD_Pratice.entity.Member;
import lombok.AllArgsConstructor;
import lombok.ToString;


@ToString
@AllArgsConstructor
public class MemberForm {

    private String email;
    private String password;

    public Member toEntity() {
        return new Member(null,email,password);
    }

    }


