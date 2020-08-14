package springboot.response;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import springboot.response.Topic;
import springboot.service.Courseservice;






@RestController
public class responseCourse {
	@Autowired
	private Courseservice service;
	@RequestMapping("topic/{topicid}/course")
	public List<Course> getAllTopic(@PathVariable String topicid)
	{
		//System.out.println("hii its me");
		return service.getAll(topicid);
			
	}
	@RequestMapping("topic/{topicid}/course/{id}")
	public Optional<Course>  getTopic(@PathVariable String id)
	{
		return  service.course(id);
	}
	

	@RequestMapping(method=RequestMethod.POST,value="topic/{topicid}/course/{id}")
	public Course addTopic(@RequestBody Course course,@PathVariable String topicid )
	{
		course.setTopic(new Topic("",topicid));
		 return service.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="topic/{topicid}/course/{id}")
	public void deleteTopic(@PathVariable String id)
	{
		service.deleteCourse(id);
	}
	@RequestMapping(method=RequestMethod.PUT,value="topic/{topicid}/course/{id}")
	public void updateTopic(@RequestBody Course course,@PathVariable String topicid)
	{
		course.setTopic(new Topic("",topicid));
			service.updateCourse(course);
	}
}
