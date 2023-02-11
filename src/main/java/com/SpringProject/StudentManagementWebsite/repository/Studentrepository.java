package com.SpringProject.StudentManagementWebsite.repository;

import com.SpringProject.StudentManagementWebsite.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Studentrepository extends JpaRepository<Student,Long> {
}
