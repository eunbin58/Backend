package com.example.backend.Controller;

import com.example.backend.Entity.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

public class MemberController {
    private final MemberServiceImpl memberServiceImpl;


    public MemberController(MemberServiceImpl memberServiceImpl) {
        this.memberServiceImpl= memberServiceImpl;
    }

    @RequestMapping("/")
    public String home(Model model) {
        return "home";
    }

    @PostMapping("/")
    public String register(RedirectAttributes redirect, Member member) {
        if (memberServiceImpl.join(member)) {
            redirect.addAttribute("msg", "회원가입이 완료되었습니다");
        } else {
            redirect.addAttribute("msg", "중복된 아이디가 존재합니다.");
        }
        return "redirect:/result_alarm";
    }

    @GetMapping("/result_alarm")
    public String result_alarm(@RequestParam("msg") String param, Model model) {
        model.addAttribute("msg", param);
        return "result_alarm";
    }
}


