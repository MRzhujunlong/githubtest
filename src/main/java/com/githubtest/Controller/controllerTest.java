package com.githubtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controllerTest {

    @RequestMapping("/get")
    public String tes(){
        return "自动部署完成";
    }

}
