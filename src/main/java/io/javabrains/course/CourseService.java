package io.javabrains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mapo0104 on 31.1.2017.
 */
@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;


    public List<Course> getAllCourses(String idTopic){
        //return courses;
        List<Course> courses = new ArrayList<>();
        courseRepository.findAll().forEach(courses::add); // najde vsechny zaznamy v db a prida je do listu courses
        return courses;
    }

    public Course getCourse(String courseId) {
        return courseRepository.findOne(courseId);
    }

    public void addCourse(Course course){
        courseRepository.save(course);
    }

    public void updateCourse(Course course) {
        courseRepository.save(course);

    }

    public void deleteCourse(String id) {
        courseRepository.delete(id);
    }
}
