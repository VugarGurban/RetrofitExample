package com.example.retrofitexample.retrofit.model.response;

import com.google.gson.annotations.SerializedName;

public class Data{
    public Data(String firstName, String lastName, int id, String email, String avatar) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.email = email;
        this.avatar = avatar;
    }

    @SerializedName("first_name")
        private String firstName;
        @SerializedName("last_name")
       private String lastName;
       private int id;
       private String email, avatar;

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getAvatar() {
            return avatar;
        }

        public String getFirstName() {
            return firstName;
        }

        public void setFirstName(String firstName) {
            this.firstName = firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public void setLastName(String lastName) {
            this.lastName = lastName;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public void setAvatar(String avatar) {
            this.avatar = avatar;
        }
    }