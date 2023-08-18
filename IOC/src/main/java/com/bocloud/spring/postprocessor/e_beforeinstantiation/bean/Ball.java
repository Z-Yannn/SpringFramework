package com.bocloud.spring.postprocessor.e_beforeinstantiation.bean;

public class Ball {

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Ball{" + "id='" + id + '\'' + '}';
    }
}

