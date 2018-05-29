package com.example.jobApps.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Courses {

    @Id
    private Object _id;
    private List<String> instructors;
    private String title;
    private String project_name;
    private String subtitle;
    private String project_description;
    private String summary;

    /*public Object getId() {
        return _id;
    }

    public void setId(Object id) {
        this._id = _id;
    }*/

    public List<String> getInstructors() {
        return instructors;
    }

    public void setInstructors(List<String> instructors) {
        this.instructors = instructors;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getProject_name() {
        return project_name;
    }

    public void setProject_name(String project_name) {
        this.project_name = project_name;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getProject_description() {
        return project_description;
    }

    public void setProject_description(String project_description) {
        this.project_description = project_description;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }
}
