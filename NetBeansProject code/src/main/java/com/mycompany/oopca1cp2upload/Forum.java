/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;


/**
 *
 * @author lapi
 */
public class Forum {

    private java.util.List<String> posts = new java.util.ArrayList<>();

    public void addPost(String post) {
        posts.add(post);
    }

    public java.util.List<String> getPosts() {
        return posts;
    }

    
}
