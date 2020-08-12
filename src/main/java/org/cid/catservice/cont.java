package org.cid.catservice;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class cont {
    @RequestMapping("/hello")
    public String sayhi(){
        return"Hello, I am SAKIF Nabil from morocco. I am a software engineer";
    }
}
