package com.learnings.kafka.configurations;

import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

@Configuration
public class KafkaTopicConfiguration {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    public NewTopic createNewTopic(String topicName) {
        NewTopic newTopic =  TopicBuilder.name(topicName)
                .partitions(1)
                .build();

        logger.info("TopicName ==> {}", newTopic);

        return newTopic;
    }
}
