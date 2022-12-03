package com.example.backterra.repositories;



import com.example.backterra.Entity.Store.Command;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Repository
public interface CommandRepository extends JpaRepository<Command,Long> {
    @Query("select c from Command c where c.cart.id=:id")
    List<Command> getCommandByCartId(@RequestParam("id") Long id);
}
