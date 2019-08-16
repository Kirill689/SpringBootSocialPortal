package com.someExample.social.entities;


import javax.persistence.*;

@Entity
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String postText;
    private String postTag;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    private User author;


    public Post (){

    }

    public Post(String postText, String postTag, User author) {
        this.postText = postText;
        this.postTag = postTag;
        this.author = author;
    }


    public String getAuthorName(){
        return author !=null ? author.getUsername() : "mr.anonymous";
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPostText() {
        return postText;
    }

    public void setPostText(String message) {
        this.postText = message;
    }

    public String getPostTag() {
        return postTag;
    }

    public void setPostTag(String title) {
        this.postTag = title;
    }
}
