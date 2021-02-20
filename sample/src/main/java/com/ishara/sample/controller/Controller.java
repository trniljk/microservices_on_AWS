package com.ishara.sample.controller;


import com.ishara.sample.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @RequestMapping("/start")
    public Response getGreeting() {

        Response response = new Response();
        response.setCode("CODE HERE");
        response.setMessage("CHECKING AUTOMATE BUILD welcome to microservices ANSIBLE");
        return response;

    }
}
