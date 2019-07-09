package com.example.demo1.controller;


import com.example.demo1.model.Train;
import com.example.demo1.repository.TrainRepository;
import org.hibernate.annotations.Parameter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TrainController {
    @Autowired
    TrainRepository trainRepository;

    @PostMapping(path="/Train")
    public void createTrain(@RequestBody Train train)
    {
        trainRepository.save(train);
    }

}
