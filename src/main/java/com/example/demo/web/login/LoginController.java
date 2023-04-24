package com.example.demo.web.login;

import com.example.demo.domain.login.LoginService;
import com.example.demo.web.utils.ResponseAPI;
import com.example.demo.web.login.dto.LoginDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttribute;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@Slf4j
public class LoginController {

    private final LoginService loginService;

    @PostMapping("/login")
    public ResponseEntity<?> login(@Validated @RequestBody LoginDto loginDto, BindingResult bindingResult, HttpServletRequest request) {

        HashMap<String, Object> result = new HashMap<>();

        if (bindingResult.hasErrors()) {
            log.info("{}", bindingResult);
            return ResponseEntity.ok(bindingResult.getAllErrors());
        }

        HttpSession session = request.getSession();
        session.setAttribute("sessionId", session.getId());
        loginDto.setSessionId(session.getAttribute("sessionId").toString());

        String name = loginService.login(loginDto);

        result.put("name", name);
        result.put("sessionId", loginDto.getSessionId());

        return ResponseEntity.ok(new ResponseAPI("success", 200, result));
    }
}
