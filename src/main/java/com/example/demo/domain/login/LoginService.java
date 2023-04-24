package com.example.demo.domain.login;

import com.example.demo.domain.member.Member;
import com.example.demo.domain.member.MemberRepository;
import com.example.demo.web.login.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@Service
@RequiredArgsConstructor
@Transactional
public class LoginService {
    private final MemberRepository memberRepository;

    public String login(LoginDto loginDto){
        Optional<Member> member = memberRepository.loginMember(loginDto.getId());
        if (member.isPresent()) {
            Member loginMember = member.get();
            loginMember.setSessionId(loginDto.getSessionId());
            return loginMember.getName();
        }else{
            return "없음";
        }
    }
}
