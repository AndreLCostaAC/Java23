package com.example.Java._3.UserLogin;

public class UserLogin {

    private Long Id;
    private String UserName;
    private String UserPassword;
    private String Email;

    public UserLogin() {
    }

    public UserLogin(Long id, String userName, String userPassword, String email) {
        Id = id;
        UserName = userName;
        UserPassword = userPassword;
        Email = email;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        UserName = userName;
    }

    public String getUserPassword() {
        return UserPassword;
    }

    public void setUserPassword(String userPassword) {
        UserPassword = userPassword;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
        return "UserLogin{" +
                "Id=" + Id +
                ", UserName='" + UserName + '\'' +
                ", UserPassword='" + UserPassword + '\'' +
                ", Email='" + Email + '\'' +
                '}';
    }
}

