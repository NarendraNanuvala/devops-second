package com.theNarendra.Springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
    

    @GetMapping
    public String sample(){
        return "This is sample Jenkins Program";
    }

}
