package com.kartik.kafka.producer.kafkaproducerdemo.service;

import com.kartik.kafka.producer.kafkaproducerdemo.config.AppConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class KafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    public boolean pushData(String testData)
    {
        this.kafkaTemplate.send(AppConstants.TEST_TOPIC_NAME,testData);
        return true;
    }
}
