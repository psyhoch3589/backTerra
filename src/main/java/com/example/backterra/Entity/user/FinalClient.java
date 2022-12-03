package com.example.backterra.Entity.user;


import javax.persistence.*;

@Entity
@Table(name = "FinalClient")
public class FinalClient extends User {
    public FinalClient( String username, String firstName, String lastName, String phone, String email, String password) {
        super(username, firstName, lastName, phone, email, password);
    }

    public FinalClient() {
    }

    public FinalClient(long id, String username, String email, String password) {
        super(id, username, email, password);
    }
}
