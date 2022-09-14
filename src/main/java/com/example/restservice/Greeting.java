package com.example.restservice;

public class Greeting {
    private long id;
    private String content;

    // constructor
    public Greeting(long id, String content){
        this.id = id;
        this.content = content;
    }

    // getters
    public long getId(){ return id; }
    public String getContent(){ return content; }
}
