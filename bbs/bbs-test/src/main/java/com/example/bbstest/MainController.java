package com.example.bbstest;

import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.conf.Settings;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import java.sql.Connection;
import java.sql.DriverManager;
import static nu.studer.sample.Tables.*;
import static org.jooq.impl.DSL.using;
import org.jooq.Record;
import org.jooq.Result;

@Controller
public class MainController {
    @Autowired
    private TweetRepository tweetRepository;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Model model) {

        String userName = "keiziban";
        String password = "secret";
        String url = "jdbc:mysql://localhost:3306/bbs_test?serverTimezone=JST";
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            Settings settings = new Settings();
            DSLContext create = using(conn, SQLDialect.MYSQL, settings);
            Result<Record> result = create.select().from(TWEET).orderBy(TWEET.ID.desc()).fetch();
            model.addAttribute("messages",result);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "index";
    }

    @PostMapping(path="/add") // Map ONLY POST Requests
    public String addNewUser (@RequestParam String name, @RequestParam String text) {
        String userName = "keiziban";
        String password = "secret";
        String url = "jdbc:mysql://localhost:3306/bbs_test?serverTimezone=JST";
        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            Settings settings = new Settings();
            DSLContext create = using(conn, SQLDialect.MYSQL, settings);
            create.insertInto(TWEET, TWEET.NAME, TWEET.TEXT)
                .values(name, text)
                .execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "redirect:/";
    }



}