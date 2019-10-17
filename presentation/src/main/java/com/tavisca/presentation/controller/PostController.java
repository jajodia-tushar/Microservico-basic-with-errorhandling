package com.tavisca.presentation.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;


@RestController
@RequestMapping("api/presentation")
public class PostController {

    @GetMapping
    public ResponseEntity<?> postData(){
        final String uri = "http://localhost:8887/api/database/";

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<List> forEntity = restTemplate.getForEntity(uri, List.class);
        return forEntity;
    }
}
