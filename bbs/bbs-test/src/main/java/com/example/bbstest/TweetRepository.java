package com.example.bbstest;
import org.springframework.data.repository.CrudRepository;

import com.example.bbstest.Tweet;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface TweetRepository extends CrudRepository<Tweet, Integer> {

}