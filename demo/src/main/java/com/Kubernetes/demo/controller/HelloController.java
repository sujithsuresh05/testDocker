package com.Kubernetes.demo.controller;

import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController implements ErrorController{

    @GetMapping(value = "/hello")
    public ResponseEntity<?> getResponse(){
        return new ResponseEntity<>("Hello Kubernetes", HttpStatus.ACCEPTED);
    }

    @RequestMapping("/error")
    public String getErrorPath()
    {
        // TODO Auto-generated method stub
        return "Invalid url";
    }
}

//  sudo docker build -f Dockerfile -t hello-kubernetes:latest .
//docker run -p 5000:5000 sujith05/hello-sujith-kubernetes:latest