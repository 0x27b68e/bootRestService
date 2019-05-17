package com.example.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

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

    
}
