package com.example.firstproject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity // DB가 해당 객체를 인식 가능!
public class Article {
    @Id // 대표값 지정!
    @GeneratedValue // 1, 2, 3 ... 자동 생성 어노테이션!
    private Long id;
    @Column
    private String title;
    @Column
    private  String Content;

    public Article(Long id, String title, String content) {
        this.id = id;
        this.title = title;
        Content = content;
    }

    @Override
    public String toString() {
        return "Article{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", Content='" + Content + '\'' +
                '}';
    }


}
