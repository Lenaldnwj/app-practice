package com.prac.apppractice.controller;

import com.prac.apppractice.model.InfoModel;
import com.prac.apppractice.repository.UserRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PracController {
    private static final Logger log = LoggerFactory.getLogger(PracController.class);

    @Autowired
    private Environment env;


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private List<InfoModel> infoModelList;

    @RequestMapping("getAll")
    public ResponseEntity<List<InfoModel>> getAll(){

        infoModelList = userRepository.findAll();
        return ResponseEntity.status(HttpStatus.CREATED).body(infoModelList);
    }

    @RequestMapping("getByAge/{age}")
    public ResponseEntity<List<InfoModel>> getByAge(@PathVariable("age") int age){

        infoModelList = userRepository.findByAge(age);
        return ResponseEntity.status(HttpStatus.CREATED).body(infoModelList);
    }


}
