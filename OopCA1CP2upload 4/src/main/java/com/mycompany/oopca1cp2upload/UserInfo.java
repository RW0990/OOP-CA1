/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oopca1cp2upload;

/**
 *
 * @author lapi
 */
public abstract class UserInfo {
    
     protected String userName;
    protected int age;
    protected double weightKg;

    protected UserInfo(String userName, int age, double weightKg) {
        this.userName = userName;
        this.age = age;
        this.weightKg = weightKg;
    }

    public String getUserName() { return userName; }
    public int getAge() { return age; }
    public double getWeightKg() { return weightKg; }

    @Override
    public String toString() {
        return "UserInfo{userName='" + userName + "', age=" + age + ", weightKg=" + weightKg + "}";
    }
    
}
