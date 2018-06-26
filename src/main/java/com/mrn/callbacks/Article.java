package com.mrn.callbacks;


import javax.persistence.*;
import java.util.Date;

@Entity
// articlelistener class wil call the method inside the class
@EntityListeners(ArticleListener.class)
public class Article {
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int articleId;

    @Column(name = "article_name")
    private String arcticleName;

    @Column(name = "date")
    private Date date;

    public Article() {
    }

    public Article(String arcticleName) {
        this.arcticleName = arcticleName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }


}
