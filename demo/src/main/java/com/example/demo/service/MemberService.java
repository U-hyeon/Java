package com.example.demo.service;

import com.example.demo.domain.Member;
import com.example.demo.repository.MemberRepository;
import com.example.demo.repository.MemoryMemberRepository;

import java.util.List;
import java.util.Optional;

public class MemberService {
    private  final MemberRepository memberRepository = new MemoryMemberRepository();

    /**
     * 회원가입 (join)
     */

    public Long join(Member member) {
        // 같은 이름이 있는 중복 회원X
        /*
        // Null의 가능성이 있다면 optional로 감싸서 반환하는 것이 좋다.
        Optional<Member> result = memberRepositgory.findByName(member.getName());
        result.ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.")
        }); // 하지만 형태가 좋지는 않기에 다음과 같이
        */

        validateDuplicateMember(member);

        memberRepository.save(member);
        return member.getId();
    }

    private void validateDuplicateMember(Member member) {
        memberRepository.findByName(member.getName()).ifPresent(m -> {
            throw new IllegalStateException("이미 존재하는 회원입니다.")
        });
    }

    /**
     * 전체 회원 조회
     * @return
     */
    public List<Member> findMembers() {
        return memberRepository.findAll();
    }

    public Optional<Member> findOne(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
