package me.arrhioui.jenkingspring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/hello/v1")
    public String test(){
        return "Hello V1.1";
    }
}
