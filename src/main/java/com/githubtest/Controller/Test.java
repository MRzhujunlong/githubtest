package com.githubtest.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test")
public class Test {
    public static void main(String[] args) {
        System.out.println("输出文字");
    }

    @RequestMapping("/te")
    public static void te(){
        System.out.println("88888888888888");
    }
}
