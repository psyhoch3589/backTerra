package com.example.backterra.Entity.user;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.time.LocalDate;


@Entity
@Table(name = "StoreOwner")
public class StoreOwner extends User {
    public StoreOwner( String username, String firstName, String lastName, String phone, String email, String password) {
        super(username, firstName, lastName, phone, email, password);
    }

    public StoreOwner(long id) {
        super(id);
    }

    public StoreOwner() {

    }


    public StoreOwner(String username, String firstName, String email, String password) {
        super(username, firstName, email, password);
    }
}
