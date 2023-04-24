package com.example.demo.web.login.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
public class LoginDto {
    @NotEmpty(message = "{0}는 공백 ㄴㄴ염")
    private String id;
    @NotEmpty(message = "{0}도 공백 ㄴㄴ염")
    private String password;

    private String sessionId;
}
