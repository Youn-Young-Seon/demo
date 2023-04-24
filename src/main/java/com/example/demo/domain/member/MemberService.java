package com.example.demo.domain.member;

import com.example.demo.web.member.dto.JoinMemberDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class MemberService {

    private final MemberRepository memberRepository;

    public void join(JoinMemberDto joinMemberDto) {
        Member member = new Member(joinMemberDto.getId(), joinMemberDto.getPw(), joinMemberDto.getName());
        memberRepository.save(member);
    }
}
