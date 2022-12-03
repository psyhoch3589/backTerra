package com.example.backterra.Entity.Store;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected long id;
    /*@OneToMany(mappedBy = "cart")
    private List<Command> commandList = new ArrayList<>();*/


    public Cart() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    /*public List<Command> getCommandList() {
        return commandList;
    }

    public void setCommandList(List<Command> commandList) {
        this.commandList = commandList;
    }*/

    @Override
    public String toString() {
        return "Cart{" +
                "id=" + id +
                '}';
    }
}
