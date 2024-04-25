package com.mystie.sbb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/")
    public String root() {
        return "redirect:/question/list";
    }

    @ResponseBody
    @GetMapping("/sbb")
    public String index() {
        System.out.println("index");
        return "index";
    }
}
