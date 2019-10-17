package com.tavisca.validateDB.controller;


import com.tavisca.validateDB.model.Employee;
import com.tavisca.validateDB.repository.UserRepository;
import com.tavisca.validateDB.validate.ValidateEmployee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/database/")
public class PostController {

    @Autowired
    UserRepository userRepository;

    @PostMapping
    @CrossOrigin
    public ResponseEntity<?> postData(@RequestBody Employee employee){
        if(ValidateEmployee.isEmployeeValid(employee))
            this.userRepository.save(employee);
        else{
            return new ResponseEntity<>("The format Of the data is not ok",HttpStatus.OK);
    }
        return new ResponseEntity<>("Inserted",HttpStatus.OK);
    }

    @GetMapping
    @CrossOrigin
    public ResponseEntity<?> getData(){
        return new ResponseEntity<>(this.userRepository.findAll(),HttpStatus.OK);
    }


}
