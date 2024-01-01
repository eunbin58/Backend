package com.example.backend.service;

import com.example.backend.repository.MemberRepository;

public class MemberService {

    private final MemberRepository memberRepository;

    public MemberService(MemberRepository memberRepository){this.memberRepository=memberRepository;}
}
