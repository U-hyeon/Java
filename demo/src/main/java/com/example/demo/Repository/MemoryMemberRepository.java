package com.example.demo.repository;

import com.example.demo.domain.Member;

import java.util.*;

public class MemoryMemberRepository implements MemberRepository {

    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    @Override
    public Member save(Member member) {
        member.setId(++sequence);
        store.put(member.getId(), member);
        return member;
    }

    @Override
    public Optional<Member> findById(Long id) {
        return Optional.ofNullable(store.get(id));
    }

    @Override
    public Optional<Member> findByName(String name) {
        return store.values().stream()
                .filter(member -> member.getName().equals(name)) /* parameter name과 일치하는지 확인*/
                .findAny();
    }

    @Override
    public List<Member> findAll() { /*java 에서는 list를 많이 쓴다*/
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear(); // store를 비운다.
    }
}
