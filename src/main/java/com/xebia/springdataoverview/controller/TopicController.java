package com.xebia.springdataoverview.controller;

import com.xebia.springdataoverview.model.Topic;
import com.xebia.springdataoverview.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;

    @GetMapping("/topic")
    public List<Topic> allTopics() {
        return topicService.getAllTopics();
    }

    @GetMapping("/topic/{foo}")
    public String getId(@PathVariable("foo") String id) {
        return id.toString();
    }

    @PostMapping("/topic")
    public void addTopic(Topic topic) {
        topicService.addTopic(topic);
    }

    @PutMapping("/topic/{id}")
    public void UpdateTopic(Topic topic, @PathVariable int id) {
        topicService.UpdateTopic(id, topic);
    }

    @DeleteMapping("/topic/{id}")
    public String deleteTopic(@PathVariable int id) {
        topicService.deleteTopic(id);
        return "Delete Successful";
    }


}
