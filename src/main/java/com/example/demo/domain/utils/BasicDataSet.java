package com.example.demo.domain.utils;

import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@MappedSuperclass
public class BasicDataSet {
    private LocalDateTime createdDate;
//    private String createdUser;
}
