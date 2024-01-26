package com.example.firstproject.controller;

import com.example.firstproject.dto.ArticleForm;
import com.example.firstproject.entity.Article;
import com.example.firstproject.repository.ArticleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired // 스프링 부트가 미리 생성해놓은 객체를 가져다가 자동 연결!
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm () {
        return "articles/new";
    }

    @PostMapping("/articles/create")
    // new.mustache 에서 던진 폼을 여기서 받고
    // ArticleForm form으로 받아 DTO 객체에서 받아 실행된다
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());
        // 1. Dto를 변환! Entity!
        Article article = form.toEntity();
        System.out.println(article.toString());
        // 2. Repository에게 Entity를 DB안에 저장하게 함!
        Article saved = articleRepository.save(article);
        System.out.println(saved.toString());
        return "";
    }

}
