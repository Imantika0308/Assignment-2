package com.example.StudentDetailsRepository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.StudentDetailsModel.Students;

@Repository
public interface StudentRepository extends MongoRepository<Students, Integer>{

	

}
