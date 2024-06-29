package com.demo.pojo;

public class Question {
    private String id;
    private String content;
    private Category category;

    public Question(String id, String content, Category category) {
        this.id = id;
        this.content = content;
        this.category = category;
    }
    
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
