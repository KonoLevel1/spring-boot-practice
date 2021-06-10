package com.example.bbstest;

import org.springframework.data.repository.CrudRepository;

import com.example.bbstest.Tweet;

public interface TweetRepository extends CrudRepository<Tweet, Integer> {

}
