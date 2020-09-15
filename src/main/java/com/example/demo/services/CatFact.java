package com.example.demo.services;

import java.util.Date;

public class CatFact implements Comparable<CatFact>{
    private String text;
    private Date createdAt;
    private Date updatedAt;

    public CatFact() {
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getCreatedAt() {
        return this.createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return this.updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public int compareTo(CatFact o) {
        return this.createdAt.compareTo(o.createdAt);

    }

    public String toString() {
        return "CatJoke{text='" + this.text + '\'' + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + '}';
    }
}
