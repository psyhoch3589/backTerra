package com.example.backterra.Entity.user;

import java.time.LocalDate;

public class FinalClient extends User {


    public FinalClient(long id, String username, String firstName, String lastName, LocalDate birthday, String phone, String email, String password) {
        super(id, username, firstName, lastName, birthday, phone, email, password);
    }

    public FinalClient() {

    }

    @Override
    public String toString() {
        return "FinalClient{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthday=" + birthday +
                ", Phone='" + Phone + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
