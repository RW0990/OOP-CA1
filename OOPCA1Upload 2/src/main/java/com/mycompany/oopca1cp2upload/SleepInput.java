/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author ryanwhite
 */
public class SleepInput {

    private int hours;
    private String book;
    private boolean up;

    public SleepInput(int hours, String book, boolean up) {
        this.hours = hours;
        this.book = book;
        this.up = up;
    }
    
    public SleepInput(int hours){
        this(hours, "",false);
    }

    public int getHours() {
        return hours;
    }

    public String getBook() {
        return book;
    }

    public boolean getUp() {
        return up;
    }
    
    
    
}
