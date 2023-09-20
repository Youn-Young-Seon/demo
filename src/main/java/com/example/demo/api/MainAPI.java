package com.example.demo.api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class MainAPI {
    @GetMapping("/")
    public ResponseEntity<?> main() {
        return ResponseEntity.ok("ok");
    }
}
