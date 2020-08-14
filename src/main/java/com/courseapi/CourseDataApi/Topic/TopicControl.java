package com.courseapi.CourseDataApi.Topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TopicControl {
	@Autowired
	private TopicService topicService;
	@RequestMapping("topic")
	public List<Topic> getAll()
	{
		return topicService.getAll();
	}
	@RequestMapping(method=RequestMethod.POST,value="topic")
	public void add(@RequestBody Topic topic)
	{
		topicService.addTopic(topic);
	}
	

}
