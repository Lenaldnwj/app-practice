package com.prac.apppractice.repository;

import com.prac.apppractice.model.InfoModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends MongoRepository<InfoModel,String> {

    List<InfoModel> findByAge(int age);

}

