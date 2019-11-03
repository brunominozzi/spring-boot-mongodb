package com.bminozzi.appspringbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bminozzi.appspringbootmongo.domain.Post;

@Repository	
public interface PostRepository extends MongoRepository<Post, String>{

}
