package com.githubtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class controllerTest {

    @RequestMapping("/get")
    @ResponseBody
    public String tes(){
        return "自动部署完成";
    }

}
