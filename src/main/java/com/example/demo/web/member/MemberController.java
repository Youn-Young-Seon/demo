package com.example.demo.web.member;

import com.example.demo.domain.member.MemberService;
import com.example.demo.web.member.dto.JoinMemberDto;
import com.example.demo.web.utils.ResponseAPI;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class MemberController {

    private final MemberService memberService;

    @PostMapping("/join")
    public ResponseEntity<?> join(@Validated @RequestBody JoinMemberDto joinMemberDto, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            log.info("{}", bindingResult);
        }
        memberService.join(joinMemberDto);
        return ResponseEntity.ok(new ResponseAPI("success", 200, ""));
    }
}
