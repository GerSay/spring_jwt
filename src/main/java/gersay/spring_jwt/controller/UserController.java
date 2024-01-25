package gersay.spring_jwt.controller;

import gersay.spring_jwt.service.JwtService;
import gersay.spring_jwt.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

@RestController
@RequestMapping("/auth/user")
@PreAuthorize("hasAnyAuthority('ROLE_USER')")
public class UserController {
    @Autowired
    private UserInfoService service;

    @Autowired
    private JwtService jwtService;

    @Autowired
    private AuthenticationManager authenticationManager;


    @GetMapping("/userProfile")
    //@PreAuthorize("hasAnyAuthority('ROLE_USER')")
    public String userProfile() {
        return "Welcome to User Profile";
    }

    /////////////////////////////////////////////////////////////////





}
