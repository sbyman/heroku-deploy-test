package com.github.sbyman.herokudeploytest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class HelloController {

    @GetMapping
    @ResponseBody
    public ResponseEntity<String> getHomepage(){
        return new ResponseEntity<>("{\n\t\"value\": \"Hello World\"\n\t}", HttpStatus.OK);
    }
}
