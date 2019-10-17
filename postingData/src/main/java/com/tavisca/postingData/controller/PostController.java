package com.tavisca.postingData.controller;


import com.tavisca.postingData.model.Employee;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/postdata")
public class PostController {

    @PostMapping
    public ResponseEntity<?> postData(@RequestBody Employee employee){
        final String uri = "http://localhost:8887/api/database/";
        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> result = restTemplate.postForEntity( uri, employee, String.class);
        return result;
    }
}
