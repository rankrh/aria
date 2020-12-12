package com.soli.Soli.services;

import com.soli.Soli.models.Member;
import com.soli.Soli.models.MemberRole;
import com.soli.Soli.repositories.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public Member createMember(Member member){

        member.encryptPassword();
        member.setRole(Arrays.asList(new MemberRole("ADMIN")));
        memberRepository.save(member);
        return member;
    }
}