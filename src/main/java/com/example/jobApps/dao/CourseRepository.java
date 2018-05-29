package com.example.jobApps.dao;

import com.example.jobApps.beans.Courses;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CourseRepository extends MongoRepository<Courses, String> {
}
