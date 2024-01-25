package gersay.spring_jwt.controller;

import gersay.spring_jwt.service.JwtService;
import gersay.spring_jwt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/admin")
@PreAuthorize("hasAnyAuthority('ROLE_ADMIN')")

public class AdminController {
    @Autowired
    private UserInfoService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;

    @GetMapping("/adminProfile")
    public String adminProfile() {
        return "Welcome to Admin Profile";
    }

}
