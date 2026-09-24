package com.jahnvi.studentmanagement.repository;

import com.jahnvi.studentmanagement.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    // JpaRepository already gives us save, findAll, findById, deleteById, etc.
    // Custom queries can be added here later, e.g. findByCourse(String course)
}
