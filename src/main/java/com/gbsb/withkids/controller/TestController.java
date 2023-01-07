package com.gbsb.withkids.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/test")
public class TestController {

    @PutMapping("/put-test")
    public ResponseEntity<String> putTest() {
        return new ResponseEntity<>("this is put", HttpStatus.OK);
    }
}
