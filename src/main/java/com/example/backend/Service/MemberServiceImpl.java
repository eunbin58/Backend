package com.example.backend.Service;

import com.example.backend.Entity.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements MemberService{
    private final MemberRepository memberRepository;

    @PersistenceContext
    private EntityManager entityManager;

    @Autowired
    public MemberServiceImpl(MemberRepository memberRepository){
        this.memberRepository= memberRepository;

    }
    @Transactional
    public boolean join(Member member) {
        // 사용자 등록 로직을 추가
        // 예를 들어, 이미 등록된 아이디가 아니라면 등록하고 true 반환, 이미 등록된 아이디라면 false 반환
        if (memberRepository.findById(member.getId()).isEmpty()) {
            memberRepository.save(member);
            entityManager.flush();
            return true;
        } else {
            return false;
        }
    }
}