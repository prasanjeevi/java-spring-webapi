package com.nu.webapi.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import java.util.Base64;

@RestController
public class AuthenticationController {

    @PostMapping("/api/auth")
    public boolean validate(@RequestHeader String authorization) {
        if(authorization != null && !authorization.isEmpty() && authorization.toLowerCase().startsWith("basic ")) {
            return base64Decode(authorization.replace("basic ", "")).equals("username:password");
        }
        return false;
    }

    public String base64Encode(String plainText) {
        return Base64.getEncoder().encodeToString(plainText.getBytes());
    }

    public String base64Decode(String encoded) {
        return new String(Base64.getDecoder().decode(encoded));
    }
}