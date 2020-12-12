package com.soli.Soli.controllers;

import com.soli.Soli.models.Member;
import com.soli.Soli.repositories.MemberRepository;
import com.soli.Soli.services.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class MemberController {

    @Autowired
    MemberService memberService;

    @Autowired
    MemberRepository memberRepository;

    @GetMapping("/login")
    public String showLoginForm(){
        return "views/loginForm";
    }


    @GetMapping("/register")
    public String registerForm(Model model){
        model.addAttribute("member", new Member());
        return "views/registerForm";
    }

    @PostMapping("/register")
    public String registerMember(Member member, Model model){

        String returnPage = "views/registerForm";

        if (member.getNum() == null){
            memberService.createMember(member);
            model.addAttribute("success", true);
            returnPage = "views/loginForm";
        } else {
            model.addAttribute("exist",true);
        }

        return returnPage;
    }
}