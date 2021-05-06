package com.devrezaur.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devrezaur.main.model.Course;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
