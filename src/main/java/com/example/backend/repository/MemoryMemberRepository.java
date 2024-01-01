package com.example.backend.repository;

import com.example.backend.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store=new HashMap<>();
    private static long sequence =0L;


}
