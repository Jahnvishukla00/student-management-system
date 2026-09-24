package com.jahnvi.studentmanagement.service;

import com.jahnvi.studentmanagement.exception.StudentNotFoundException;
import com.jahnvi.studentmanagement.model.Student;
import com.jahnvi.studentmanagement.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    // CREATE
    public Student createStudent(Student student) {
        return studentRepository.save(student);
    }

    // READ - all students
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    // READ - single student by id
    public Student getStudentById(Long id) {
        return studentRepository.findById(id)
                .orElseThrow(() -> new StudentNotFoundException(id));
    }

    // UPDATE
    public Student updateStudent(Long id, Student updatedStudent) {
        Student existingStudent = getStudentById(id);

        existingStudent.setName(updatedStudent.getName());
        existingStudent.setEmail(updatedStudent.getEmail());
        existingStudent.setAge(updatedStudent.getAge());
        existingStudent.setCourse(updatedStudent.getCourse());
        existingStudent.setPhoneNumber(updatedStudent.getPhoneNumber());

        return studentRepository.save(existingStudent);
    }

    // DELETE
    public void deleteStudent(Long id) {
        Student student = getStudentById(id);
        studentRepository.delete(student);
    }
}
