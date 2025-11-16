package com.mycompany;

public abstract class userInfo {
    protected String userName;
    protected int age;
    protected double weightKg;

    protected userInfo(String userName, int age, double weightKg) {
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