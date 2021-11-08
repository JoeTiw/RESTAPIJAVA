package com.bhupinspringproj.firstproj.repository;

import com.bhupinspringproj.firstproj.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student, Integer> {                   //give the primary key

}
