package com.example.backterra.Entity.user;

import java.time.LocalDate;

public class StoreOwner extends User {
    public StoreOwner(long id, String username, String firstName, String lastName, LocalDate birthday, String phone, String email, String password) {
        super(id, username, firstName, lastName, birthday, phone, email, password);
    }
    public StoreOwner(){
        super();
    }

    @Override
    public String toString() {
        return "StoreOwner{" +
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
