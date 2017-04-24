package io.javabrains.course;

import io.javabrains.topic.Topic;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * Created by mapo0104 on 31.1.2017.
 * alt + insert na vytvoření getterů a setterů
 */
@Entity
public class Course {
    @Id
    private String id;
    private String name;
    private String description;
    private Topic topic;

    public Course() {}

    public Course(String id, String name, String description, String topicId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.topic = new Topic(topicId,"","");
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Topic getTopic() {
        return topic;
    }

    public void setTopic(Topic topic) {
        this.topic = topic;
    }
}
