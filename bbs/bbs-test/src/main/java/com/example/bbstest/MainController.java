package com.example.bbstest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class MainController {
    @Autowired
    private TweetRepository tweetRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {
        model.addAttribute("messages", tweetRepository.findAll());
        return "index";
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewUser (@RequestParam String name
            , @RequestParam String text) {

        Tweet tweet = new Tweet();
        tweet.setName(name);
        tweet.setText(text);
        tweetRepository.save(tweet);
        return "redirect:/";
    }

    @GetMapping(path="/all")
    public @ResponseBody Iterable<Tweet> getAllUsers() {
        // This returns a JSON or XML with the users
        return tweetRepository.findAll();
    }



        // This returns a JSON or XML with the user



}