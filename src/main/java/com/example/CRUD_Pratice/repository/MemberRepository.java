package com.example.CRUD_Pratice.repository;

import com.example.CRUD_Pratice.entity.Member;
import org.springframework.data.repository.CrudRepository;

public interface MemberRepository extends CrudRepository<Member, Long> {
}
