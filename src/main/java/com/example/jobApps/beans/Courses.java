package com.example.jobApps.beans;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class Courses {

    @Id
    private Object _id;
    private List<String> _instructor;
    private String _title;
    private String _projectDesc;
    private String _subtitle;

    public Object get_id() {
        return _id;
    }

    public void set_id(Object _id) {
        this._id = _id;
    }

    public List<String> get_instructor() {
        return _instructor;
    }

    public void set_instructor(List<String> _instructor) {
        this._instructor = _instructor;
    }

    public String get_title() {
        return _title;
    }

    public void set_title(String _title) {
        this._title = _title;
    }

    public String get_projectDesc() {
        return _projectDesc;
    }

    public void set_projectDesc(String _projectDesc) {
        this._projectDesc = _projectDesc;
    }

    public String get_subtitle() {
        return _subtitle;
    }

    public void set_subtitle(String _subtitle) {
        this._subtitle = _subtitle;
    }
}
