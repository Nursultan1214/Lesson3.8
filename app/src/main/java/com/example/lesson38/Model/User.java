package com.example.lesson38.Model;

public class User {

    private String first;
    private String first2;
    private String type;

    public User(String first, String first2,String type) {
        this.first = first;
        this.first2 = first2;
        this.type = type;
    }


    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getFirst2() {
        return first2;
    }

    public void setFirst2(String first2) {
        this.first2 = first2;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
