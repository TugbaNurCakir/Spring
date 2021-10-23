package com.tugbanur.firstproject.Controller;

import com.tugbanur.firstproject.Service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    private HelloService helloService;
    @Autowired //recommended is constructor
    public HelloController(HelloService helloService) {
        this.helloService = helloService;
    }

    @RequestMapping("/")
    @ResponseBody
    public String sayHello(){
        return helloService.sayHello();
    }


}
