package com.example.demo.web.member.dto;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class JoinMemberDto {
    @NotNull
    private String id;
    @NotNull
    private String pw;
    @NotNull
    private String name;
}
