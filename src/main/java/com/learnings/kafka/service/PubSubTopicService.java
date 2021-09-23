package com.learnings.kafka.service;

import org.apache.kafka.clients.admin.NewTopic;

public interface PubSubTopicService {
    NewTopic createTopic(String topicName);
}
