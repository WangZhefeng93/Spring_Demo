package com.ccff.spring.assembling.pojo;

public class User {
    private Long userId;
    private String userName;
    private String userNote;

    public User() {
    }

    public User(Long userId, String userName, String userNote) {
        this.userId = userId;
        this.userName = userName;
        this.userNote = userNote;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNote() {
        return userNote;
    }

    public void setUserNote(String userNote) {
        this.userNote = userNote;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userNote='" + userNote + '\'' +
                '}';
    }
}
