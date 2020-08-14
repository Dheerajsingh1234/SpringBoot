package com.courseapi.CourseDataApi.Topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;
@Service
public class TopicService {
	@Autowired
	private TopicRepository topicrepository;

	public List<Topic> getAll() {
		// TODO Auto-generated method stub
		List<Topic>topic=new ArrayList<>();
		((CrudRepository<Topic, String>) topicrepository).findAll().forEach(topic::add);;
		return  topic;
	}

	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		((CrudRepository<Topic, String>) topicrepository).save(topic);
	}

}
