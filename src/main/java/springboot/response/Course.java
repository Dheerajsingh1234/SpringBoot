package springboot.response;



import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
	@Id
	private String id;
	private String name;
	//private String Discription;
	@ManyToOne
	private Topic topic;
	public Course( String name,String id,String topicid)
	{
		super();
		
		this.name=name;
		this.id=id;
		this.setTopic(new Topic("",topicid));
		//this.Discription=Discription;
	}
	public Course()
	{
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Topic getTopic() {
		return topic;
	}
	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	

}
