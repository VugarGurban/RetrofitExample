package com.example.retrofitexample.retrofit.model.request;

public class CreateUserRequestModel {
    public CreateUserRequestModel(String name, String job) {
        this.name = name;
        this.job = job;
    }

    String name, job;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}
