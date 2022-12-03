package com.example.backterra.repositories;

import com.example.backterra.Entity.Store.Product;
import com.example.backterra.Entity.Store.Store;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StoreRepository extends JpaRepository<Store, Long> {
}
