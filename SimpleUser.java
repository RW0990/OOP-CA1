/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author lapi
 */
public class SimpleUser extends UserInfo {
    
    public SimpleUser(String userName, int age, double weightKg) {
        super(userName, age, weightKg);
    }

    public String getUserName() {
        return userName;
    }

    public int getAge() {
        return age;
    }

    public double getWeightKg() {
        return weightKg;
    }
    
    
    
}

