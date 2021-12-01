package com.example.myapplication;

public class LoginResponse {
    private int id;
    private String email;
    private String nickName;
    private String avatar;
    private String token;

    public int getUser_id() {
        return id;
    }

    public void setUser_id(int user_id) {
        this.id = user_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String username) {
        this.nickName = username;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
