package com.gbsb.withkids.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/test")
public class TestController {

    //get은 데이터를 조회할 때 사용한다. RestApi의 규칙 1
    @GetMapping("/get-test")
    public ResponseEntity<String> getTest() {
        return new ResponseEntity<>("this is get", HttpStatus.OK);
    }

    //post는 데이터를 삽입할 때 사용한다. RestApi의 규칙 2
    @PostMapping("/post-test")
    public ResponseEntity<String> postTest() {
        return new ResponseEntity<>("this is post", HttpStatus.OK);
    }

    //put은 데이터를 갱신할 때 사용한다. RestApi의 규칙 3
    @PutMapping("/put-test")
    public ResponseEntity<String> putTest() {
        return new ResponseEntity<>("this is put", HttpStatus.OK);
    }

    //delete는 데이터를 삭제할 때 사용한다. RestApi의 규칙 4
    @DeleteMapping("/delete-test")
    public ResponseEntity<String> deleteTest() {
        return new ResponseEntity<>("this is delete", HttpStatus.OK);
    }
}
