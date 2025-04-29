package com.example.CRUD_Pratice.dto;

import com.example.CRUD_Pratice.entity.Member;

public class MemberForm {

    private String email;
    private String password;

    public Member toEntity() {
        return new Member(null,email,password);
    }


    public boolean toString;


    @Override
    public String toString() {
        return "MemberForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public MemberForm(String email, String password) {
        this.email = email;
        this.password = password;


    }



}
