package com.mrn.callbacks;

import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import java.util.Date;

public class ArticleListener {
    // Specifies a callback method for the corresponding lifecycle event.
    // This annotation may be applied to methods of an entity class, a mapped superclass, or a callback listener class
    @PrePersist
    public void beforePersist(Article article) {
        article.setDate(new Date());
    }

    // Specifies a callback method for the corresponding lifecycle event.
    // This annotation may be applied to methods of an entity class, a mapped superclass, or a callback listener class.
    @PostPersist
    public void afterPersist(Article article) {
        System.out.println("after persisting article...");
    }

}
