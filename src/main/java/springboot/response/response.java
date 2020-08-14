package springboot.response;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import springboot.service.Topicservice;




@RestController
public class response {
	@Autowired
	private Topicservice service;
	@RequestMapping("topics")
	public List<Topic> getAllTopic()
	{
		//System.out.println("hii its me");
		return service.getAll();
			
	}
	@RequestMapping("topic/{id}")
	public Topic getTopic(@PathVariable int id)
	{
		return service.topic(id);
	}
	

	@RequestMapping(method=RequestMethod.POST,value="topics")
	public void addTopic(@RequestBody Topic topics )
	{
		 service.addTopic(topics);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="topic/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		service.deleteTopic(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value="topic/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable String id)
	{
			service.updateTopic(topic);
	}
}
