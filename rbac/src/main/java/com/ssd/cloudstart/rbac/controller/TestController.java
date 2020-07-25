package com.ssd.cloudstart.rbac.controller;

import com.ssd.cloudstart.rbac.feign.client.MessageClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {

    @Autowired
    private MessageClient messageClient;

    @RequestMapping("/getMessage")
    @ResponseBody
    public String getMessage(){
        return messageClient.getMessage();
    }

}
