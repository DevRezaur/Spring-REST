package com.devrezaur.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.devrezaur.main.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {
	
}
