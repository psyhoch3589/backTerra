package com.example.backterra.Entity.Store;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Table
public class Store {
    @Id
    private Long id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private double storage;
    private int traffic;

    /*@OneToMany(mappedBy="store")
    private List<PaymentMethod> paymentMethods;*/
    //private Product products;

    public Store() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public int getTraffic() {
        return traffic;
    }

    public void setTraffic(int traffic) {
        this.traffic = traffic;
    }

  /* public List<PaymentMethod> getPaymentMethod() {
        return paymentMethods;
    }

    public void setPaymentMethod(List<PaymentMethod> paymentMethod) {
        this.paymentMethods = paymentMethod;
    }

    public void addPaymentMethod(PaymentMethod paymentMethod) {
        this.paymentMethods.add(paymentMethod);
    }*/

    /* public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }*/

    public Store(Long id, String name, int traffic) {
        this.id = id;
        this.name = name;
        this.traffic = traffic;
        //paymentMethods = new ArrayList<>();


    }
}
