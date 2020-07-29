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

package com.example.jooq.db;


import static com.example.jooq.db.Tables.*;
import static org.jooq.impl.DSL.*;

import java.sql.Connection;
import java.sql.DriverManager;

import org.jooq.DSLContext;
import org.jooq.Record;
import org.jooq.Result;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.example.jooq.db.tables.records.ActorRecord;
import com.example.studer.sample.tables.Actor;
import com.example.studer.db.tables.Prefecture;

import javax.annotation.Generated;

import com.example.jooq.db.tables.Actor;
import com.example.jooq.db.tables.Prefecture;

import javax.annotation.Generated;
import java.sql.Connection;
import java.sql.DriverManager;

@Controller
public class MainController {
    @Autowired
    private TweetRepository tweetRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        //
        String userName = "keiziban";
        String password = "secret";
        String url = "jdbc:mysql://localhost:3306/bbs_test?serverTimezone=JST";
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {

            DSLContext create = using(conn, SQLDialect.MYSQL, settings);
            create.select(TWEET.NAME, TWEET.TEXT).from(TWEET).orderBy(TWEET.ID.desc().fetch();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
        //







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