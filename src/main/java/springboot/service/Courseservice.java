package springboot.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springboot.response.Course;
@Service
public class Courseservice {
@Autowired
private CourseRepository courserepository;
	public List<Course> getAll(String topicid) {
		// TODO Auto-generated method stub
		//return null;
		List<Course> Courses=new ArrayList<>();
		courserepository.findBytopicId(topicid).forEach(Courses::add);
		return Courses;
		
	}

	public Optional<Course> course(String id) {
		// TODO Auto-generated method stub
	   return courserepository.findById(id);
		//return null;
	}

	

	public Course addCourse(Course course) {
		// TODO Auto-generated method stub
		return courserepository.save(course);
		//courserepository.save(course);
	}

	public void deleteCourse(String id) {
		// TODO Auto-generated method stub
		//courserepository.deleteById(id);
	}

	public void updateCourse(Course course) {
		// TODO Auto-generated method stub
		//courserepository.save(course);
		
	}


}
