package io.javabrains.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by mapo0104 on 31.1.2017.
 */
@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("/topics/{id}/courses/") //GET default
    public List<Course> getAllCourses(@PathVariable("id") String topicId) {
        return courseService.getAllCourses(topicId);
    }

    @RequestMapping(value = "/topics/{topicId}/course/{courseId}", method = RequestMethod.GET)
    public Course getCourse(@PathVariable("courseId") String courseId) {
        return courseService.getCourse(courseId);
    }

    @RequestMapping(value = "/topics/{topicId}/course/", method = RequestMethod.POST)
    public void addCourse(@RequestBody Course course) {
        courseService.addCourse(course);
    }

    @RequestMapping(value = "/topics/{topicId}/course/{courseId}", method = RequestMethod.PUT)
    public void updateCourse(@RequestBody Course course, @PathVariable String id) {
        courseService.updateCourse(course,id);
    }

    @RequestMapping(value = "/topics/{topicId}/course/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable("id") String id) {
         courseService.deleteCourse(id);
    }


}
