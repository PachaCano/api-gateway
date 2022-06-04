package com.pc.apigateway.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/health")
public class HealthController {

    @GetMapping("/check")
    public ResponseEntity<Boolean> healthCheck() {
        return new ResponseEntity<>(true, HttpStatus.OK);
    }

}
