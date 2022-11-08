package com.example.backterra.repositories;

import com.example.backterra.Entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends JpaRepository<User,Long> {

    default boolean checkAuth(User u){
        return true;
    }

    @Query("SELECT p FROM StoreOwner p WHERE LOWER(p.email)=LOWER(:q)")
    User findByEmail(@Param("q") String q);
}
