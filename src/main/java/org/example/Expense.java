package org.example;

import java.util.List;

public class Expense {
    private String id;
    private double amount;
    private User paidBy;
    private List<User> splitAmong;
    private String splitType;

//    Generated Constructor and Getter / Setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getPaidBy() {
        return paidBy;
    }

    public void setPaidBy(User paidBy) {
        this.paidBy = paidBy;
    }

    public List<User> getSplitAmong() {
        return splitAmong;
    }

    public void setSplitAmong(List<User> splitAmong) {
        this.splitAmong = splitAmong;
    }

    public String getSplitType() {
        return splitType;
    }

    public void setSplitType(String splitType) {
        this.splitType = splitType;
    }

    public Expense(String id, double amount, User paidBy, List<User> splitAmong, String splitType) {
        this.id = id;
        this.amount = amount;
        this.paidBy = paidBy;
        this.splitAmong = splitAmong;
        this.splitType = splitType;
    }
}
