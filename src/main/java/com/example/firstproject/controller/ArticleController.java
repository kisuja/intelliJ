package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @GetMapping("/articles/new")
    public String newArticleForm () {
        return "articles/new";
    }
    @PostMapping("/articles/create")
    // new.mustache 에서 던진 폼을 여기서 받고
    // ArticleForm form으로 받아 DTO 객체에서 받아 실행된다
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        return "";
    }

}
