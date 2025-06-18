// controller/AdminLoginController.java
package com.vijay.controller;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vijay.auth.LoginRequest;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class AdminLoginController {

    // Hardcoded admin credentials
    private final String ADMIN_USERNAME = "admin";
    private final String ADMIN_PASSWORD = "admin";

    @PostMapping("/admin/login")
    public ResponseEntity<?> login(@RequestBody LoginRequest loginRequest) {
    	System.out.print("entered in login method");
        if (ADMIN_USERNAME.equals(loginRequest.getUsername()) &&
            ADMIN_PASSWORD.equals(loginRequest.getPassword())) {

            // You can later return a JWT here
            return ResponseEntity.ok("Login successful");
        } else {
            return ResponseEntity.status(401).body("Invalid username or password");
        }
    }
}
