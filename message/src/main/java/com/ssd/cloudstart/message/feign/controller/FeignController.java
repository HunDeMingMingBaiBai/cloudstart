package com.ssd.cloudstart.message.feign.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/feign")
public class FeignController {

    @RequestMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        return "message getMessage() success";
    }

}
