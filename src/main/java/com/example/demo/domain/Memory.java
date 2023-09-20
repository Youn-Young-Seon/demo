package com.example.demo.domain;

import com.example.demo.domain.utils.BasicDataSet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Memory extends BasicDataSet {
    @Id
    @GeneratedValue
    private Long idx;
    private String fileName;
    private String path;
    private LocalDateTime takeDate;
}
