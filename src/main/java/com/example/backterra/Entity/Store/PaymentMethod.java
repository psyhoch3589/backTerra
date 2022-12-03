package com.example.backterra.Entity.Store;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table
public class PaymentMethod {
    @Id
    private Long id;
    private String name;

    @ManyToMany
    @JoinColumn(name = "stor")
    private List<Store> stores;

    public void setId(Long id) {
        this.id = id;
    }


    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PaymentMethod(Long id, String name) {
        this.id = id;
        this.name = name;
        stores = new ArrayList<>();
    }
    public PaymentMethod() {
        stores = new ArrayList<>();
    }

    public void setStores(Store store) {
        this.stores.add(store);
    }

    public List<Store> getStores() {
        return stores;
    }
}
