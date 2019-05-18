package com.example.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.model.Topic;

@Service // creating available bean for other class
public class TopicsService {
	
	private List<Topic> topics = new ArrayList<Topic>(Arrays.asList(
			new Topic("JQuery", "Learninng  JQuery"),
			new Topic("React", "Learninng  React")
			));
	
public List<Topic> listTopics() {	
		return topics;
	}

public Topic getTopic(String title) {
	Topic topic = topics.stream().filter((t) -> t.getTitle().equals(title)).findFirst().get();
	return topic;
}


public void adddTopic(Topic topic) {
	topics.add(topic);
}

public void updateTopic(String id, Topic topic) {
	// TODO Auto-generated method stub
	for (int i = 0; i < topics.size(); i++) {
		Topic t = topics.get(i);
		if(t.getTitle().equals(id)) {
			topics.set(i, topic);
			return;
		}
	}
}

//version 1
/*public void deleteTopic(String id) {
	// TODO Auto-generated method stub
	for (Topic topic : topics) {
	    if(topic.getTitle().equals(id)) {
		topics.remove(topic);
		return;
	    }
	}
	
} */

// version 2

public void deleteTopic(String id) {
	topics.removeIf((t) -> t.getTitle().equals(id));
}
    
}
