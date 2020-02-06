package com.example.demo.repo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Person;
@Repository
public interface PersonRepository extends MongoRepository<Person, String> {

}