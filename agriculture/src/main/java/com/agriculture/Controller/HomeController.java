package com.agriculture.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {

@GetMapping("/home")
public String home(){
    return "home";
}

    @GetMapping("/services")
    public String services(){
        return"services";
    }
    //demo
    @GetMapping("/demo")
    public String demo(){
        return"demo";
    }
    @GetMapping("/contactUs")
    public String contactUs(){
        return"contactUs";
    }
    @GetMapping("/registration")
    public String registration(){
    return "registration";
    }
    @GetMapping("/AboutUs")
    public String aboutUs(){
        return "AboutUs";
    }
}




