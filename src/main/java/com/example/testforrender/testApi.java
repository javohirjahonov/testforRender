package com.example.testforrender;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class testApi {

    @GetMapping("/test")
    public String test() {
        return "test";
    }

}
