package com.Kubernetes.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KubernetesController {

    @GetMapping(value = "/hello")
    public ResponseEntity<?> getResponse(){
        return new ResponseEntity<>("Hello Kubernetes", HttpStatus.ACCEPTED);
    }
}

//  sudo docker build -f Dockerfile -t hello-kubernetes:latest .
