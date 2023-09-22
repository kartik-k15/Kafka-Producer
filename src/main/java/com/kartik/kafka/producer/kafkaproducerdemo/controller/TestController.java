package com.kartik.kafka.producer.kafkaproducerdemo.controller;

import com.kartik.kafka.producer.kafkaproducerdemo.service.KafkaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private KafkaService kafkaService;

    @PostMapping("/postKafka")
    public ResponseEntity<?> postKafkaData(String testData){
        kafkaService.pushData(testData);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
