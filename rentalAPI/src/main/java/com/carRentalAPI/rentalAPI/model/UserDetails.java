package com.carRentalAPI.rentalAPI.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_details")
public class UserDetails {
    public static long allUserId = 10000;
    @Id
    private String userId;
    private String username;
    private String password;
    private String email;
    private String userAccessToken;

    public UserDetails() {
    }

    public UserDetails(String userId, String username, String password, String email, String userAccessToken) {
        this.username = username;
        this.password = password;
        this.email = email;
        this.userAccessToken = userAccessToken;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserAccessToken() {
        return userAccessToken;
    }

    public void setUserAccessToken(String userAccessToken) {
        this.userAccessToken = userAccessToken;
    }
}
