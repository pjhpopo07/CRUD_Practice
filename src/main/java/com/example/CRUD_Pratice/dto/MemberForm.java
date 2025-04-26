package com.example.CRUD_Pratice.dto;


public class MemberForm {
    public boolean toString;

    @Override
    public String toString() {
        return "MemberForm{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public MemberForm(String email, String password) {
        this.password = password;
        this.email = email;
    }

    private String email;
    private String password;
}
