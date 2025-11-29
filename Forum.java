/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;


import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lapi
 */
public class Forum {

    private final List<String> post;
    private int counter;

    public Forum() {
        post = new ArrayList<>();
        counter = 0;

    }

    public void addPost(String text) {
        if (text == " ") {

        } else {
            counter++;
            post.add(text);
            System.out.println("Post added correctly");
        }

    }

    public void getPosts() {
        if (counter == 1) {
            System.out.println("There is currently " + counter + " post");
        } else {
            System.out.println("There are currently " + counter + " posts");
        }
        int i = 1;
        for (String s : post) {
            System.out.println(i + "." + s);
            i++;
        }
    }

}
