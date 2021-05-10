package com.springldapsecurity.vk.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest")
public class RestAppController {

    @GetMapping("/secure")
    public String secureMethod() {
        return "secure rest endpoint";
    }
//    @GetMapping("/error")
//    public String error()
//    {
//        return "Error";
//    }

}

