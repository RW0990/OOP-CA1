package com.mycompany;



import java.util.ArrayList;

import java.util.List;

public class Forum {
    private final List<String> post = new ArrayList<>();

    public void addPost(String text) {
        post.add(text);
    }

    public void getPosts() {
        
        for (String p : post) {
            System.out.println(p);
        }
    }
}
