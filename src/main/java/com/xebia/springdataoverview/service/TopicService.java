package com.xebia.springdataoverview.service;

import com.xebia.springdataoverview.model.Topic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class TopicService {

    private List<Topic> topics = new ArrayList<>(Arrays.asList(new Topic
            ("Invisible Man", 201), new Topic("Man in Space", 202)));

    public List<Topic> getAllTopics() {
        return topics;
    }

    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    public String UpdateTopic(int id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);
            if (t.getId() == id) {
                topics.set(i, topic);

            }
        }
        return "Update Successful";

    }

    public void deleteTopic(int id) {
//        topics.removeIf(t->t.getId()==id);  //Lambda Expression
        for(int i=0;i<topics.size();i++)
        {
            Topic t=topics.get(i);
            if (t.getId()==id)
            {
                topics.remove(i);
            }
        }

    }
}
