package com.example.Spring.Boot.Demo.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    //getting student by email
    //SELECT * FROM student where email = ?
    @Query("SELECT s FROM Student s where s.email = ?1")
    Optional<Student> findStudentEmail(String email);
}
