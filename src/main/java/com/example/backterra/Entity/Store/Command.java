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
    @ManyToMany
    @JoinTable(
            name = "product_in_command",
            joinColumns = @JoinColumn(name = "command_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id")
    )
    private List<Product> product;
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

    public List<Product> getProduct() {
        return product;
    }

    public void setProduct(List<Product> product) {
        this.product = product;
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
