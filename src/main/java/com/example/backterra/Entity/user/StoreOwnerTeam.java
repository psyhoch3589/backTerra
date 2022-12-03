package com.example.backterra.Entity.user;


import javax.persistence.*;

@Entity
@Table(name = "StoreOwnerTeam")
public class StoreOwnerTeam extends User {
    public StoreOwnerTeam( String username, String firstName, String lastName, String phone, String email, String password) {
        super(username, firstName, lastName, phone, email, password);
    }

    public StoreOwnerTeam() {
    }

    public StoreOwnerTeam(long id, String username, String email, String password) {
        super(id, username, email, password);
    }
}
