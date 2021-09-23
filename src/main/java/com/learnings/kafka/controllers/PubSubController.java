package com.learnings.kafka.controllers;

import com.learnings.kafka.service.PubSubTopicService;
import lombok.RequiredArgsConstructor;
import org.apache.kafka.clients.admin.NewTopic;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PubSubController {

    private final PubSubTopicService pubSubTopicService;

    @RequestMapping(value = "/api/v1/topic/{topicName}", method = RequestMethod.POST)
    public ResponseEntity<?> createTopic(@PathVariable("topicName")String topicName){

        NewTopic newTopic = pubSubTopicService.createTopic(topicName);

        return new ResponseEntity<>(newTopic.name(), HttpStatus.OK);
    }


}
