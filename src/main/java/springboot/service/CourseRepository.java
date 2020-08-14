package springboot.service;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import springboot.response.Course;

public interface CourseRepository extends CrudRepository<Course,String> {

	//Course findOne(String id);
	public List<Course> findBytopicId(String topic);
	

	

}
