package com.example.demo.domain.utils;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
@Setter
@Getter
public class CreateInfo {
    private LocalDateTime createDate;
    private String createUser;
    private LocalDateTime updateDate;
    private String UpdateUser;
}
