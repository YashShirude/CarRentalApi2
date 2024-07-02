package com.carRentalAPI.rentalAPI.model;

public class SignUpDetails {
    private String inputUsername;
    private String inputPassword;
    private String inputEmail;

    public SignUpDetails() {
    }

    public SignUpDetails(String inputUsername, String inputPassword, String inputEmail) {
        this.inputUsername = inputUsername;
        this.inputPassword = inputPassword;
        this.inputEmail = inputEmail;
    }

    public String getInputUsername() {
        return inputUsername;
    }

    public void setInputUsername(String inputUsername) {
        this.inputUsername = inputUsername;
    }

    public String getInputPassword() {
        return inputPassword;
    }

    public void setInputPassword(String inputPassword) {
        this.inputPassword = inputPassword;
    }

    public String getInputEmail() {
        return inputEmail;
    }

    public void setInputEmail(String inputEmail) {
        this.inputEmail = inputEmail;
    }
}
