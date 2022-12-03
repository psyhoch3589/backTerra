package com.example.backterra.repositories;

import com.example.backterra.Entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;


@org.springframework.stereotype.Repository
public interface  Repository extends JpaRepository<User,Long> {

}
