package com.example.backterra.repositories;


import com.example.backterra.Entity.Store.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface ProductRepository extends JpaRepository<Product,Long> {
    @Query("select p from Product p inner join p.command c where c.id=:idCommand")
    List<Product> fetchProducts(@Param("idCommand") Long id);

    /*List<Product> findAll();
    @Modifying
    @Query("delete from Product p where p.command.id=:id")
    void deleteAllProducts(Long id);*/


}
