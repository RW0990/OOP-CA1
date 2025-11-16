package com.mycompany;


public class SimpleUser extends userInfo {
    public SimpleUser(String userName, int age, double weightKg) {
        super(userName, age, weightKg);
    }
    public double getWeight() {
        return weightKg;
    }
    public String getName() {
        return userName;
    }
    public int getAge() {
        return age; 
    }
}
