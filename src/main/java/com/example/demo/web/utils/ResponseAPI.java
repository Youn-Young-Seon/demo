package com.example.demo.web.utils;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class ResponseAPI {
    private String status;
    private Integer code;
    private Object data;
}
