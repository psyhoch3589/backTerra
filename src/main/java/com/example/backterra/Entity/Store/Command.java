package com.example.backterra.Entity.Store;




import javax.persistence.*;
import java.util.List;

@Entity
public class Command {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected long id;
    @Column(name = "closed")
    private boolean closed;

    @ManyToOne
    @JoinColumn(name = "cart_id")
    private Cart cart;

    public Command() {}
    public Command(Cart cart) {
        this.cart = cart;
    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public boolean isClosed() {
        return closed;
    }

    public void setClosed(boolean closed) {
        this.closed = closed;
    }
    public Cart getCart(){
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @Override
    public String toString() {
        return "Command{" +
                "id=" + id +
                ", closed=" + closed +
                ", cart=" + cart +
                '}';
    }
}
