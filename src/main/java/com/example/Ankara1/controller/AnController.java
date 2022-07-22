package com.example.Ankara1.controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnController {
    @GetMapping()
    public String an(){
        return "welcome Kana";
    }
}
