package com.learnings.kafka.serviceImpl;

import com.learnings.kafka.configurations.KafkaTopicConfiguration;
import com.learnings.kafka.service.PubSubTopicService;
import org.apache.kafka.clients.admin.AdminClient;
import org.apache.kafka.clients.admin.AdminClientConfig;
import org.apache.kafka.clients.admin.CreateTopicsResult;
import org.apache.kafka.clients.admin.NewTopic;
import org.apache.kafka.common.errors.TopicExistsException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.Properties;
import java.util.concurrent.ExecutionException;

@Service
public class PubSubTopicServiceImpl implements PubSubTopicService {

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    @Autowired
    KafkaTopicConfiguration kafkaTopicConfiguration;


    @Override
    public NewTopic createTopic(String topicName) {
        return kafkaTopicConfiguration.createNewTopic(topicName);
    }
}
