package com.example.demo.domain.member;

import com.example.demo.domain.utils.CreateInfo;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Member extends CreateInfo {

    @Id
    @GeneratedValue
    private Long id;
    private String memberId;
    private String password;
    private String name;
    private String sessionId;

    public Member(String memberId, String password, String name) {
        this.memberId = memberId;
        this.password = password;
        this.name = name;
    }
}
