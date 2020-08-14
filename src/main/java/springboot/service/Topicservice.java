package springboot.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.response.Topic;
@Service
public class Topicservice {
	@Autowired
	private Repositorytopic repository;
	private List<Topic> topics=new ArrayList<Topic>(Arrays.asList(
							new Topic("dheeraj","12"),
							new Topic("Krishana","22")
							));
	
	public List<Topic> getAll()
	{
		List<Topic> list=new ArrayList<>();
		repository.findAll().forEach(list::add);
		return list;
	}



	
	public Topic topic(int id) {
		for(int i=0;i<topics.size();i++)
		{
			//Topic topic=new Topic();
			Topic topic=topics.get(i);
			if(topic.getId().equals(id))
			{
				return topic;
			}
			
		}
		return null;
		
	}




	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		repository.save(topic);
		//topics.add(topic);
		//return topics;
	}




	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
		repository.deleteById(id);
		//topics.removeIf(t -> t.getId().equals(id));
		//return topics;
	}




	public void updateTopic(Topic topic ) {
		// TODO Auto-generated method stub
		/*for(int i=0;i<topics.size();i++)
		{
			Topic topic1=topics.get(i);
			if(topic1.getId().equals(id))
			{
				topic1.setName(topic.getName());
			}
		}*/
		repository.save(topic);
		//repository.
		
	}
	

}
