package com.example.backterra.Service;


import com.example.backterra.Entity.Store.Cart;
import com.example.backterra.Entity.Store.Command;
import com.example.backterra.Entity.Store.Product;
import com.example.backterra.repositories.CartRepository;
import com.example.backterra.repositories.CommandRepository;
import com.example.backterra.repositories.ProductRepository;
import net.minidev.json.JSONArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {
    @Autowired
    CommandRepository commandRepository;

    @Autowired
    ProductRepository pr;

    @Autowired
    CartRepository cr;

    public Command findCommandById(Long id){
        return this.commandRepository.findById(id).get();
    }

    public Cart addCart(){
        return this.cr.save(new Cart());
    }
    public Product checkProduct(Long idProduct){
        return this.pr.findById(idProduct).get();
    }
    public Command addCommand(Cart cart){
        Command Command =new Command(cart);
        return this.commandRepository.save(Command);
    }
    public List<Product> showOnGoingCommand(Long idCart){
        Command c = this.commandRepository.getCommandByCartId(idCart)
                .stream()
                .filter(x->!x.isClosed())
                .findFirst()
                .get();//if empty we gonna have error
        return this.pr.fetchProducts(c.getId());
    }
    public boolean fillCommandByProducts(List<Product> products ,Cart cart){
        Command command = this.commandRepository.getCommandByCartId(cart.getId())
                .stream()
                .filter(y->!y.isClosed())
                .findFirst()
                .get();
        products.stream().forEach(x->{
            x.setCommand(command);
            this.pr.save(x);
        });
        return true;
    }
    public Product convertToObject(Product p){
        return new Product(p.getId(),p.getTitle());
    }

    public void deleteProductById(Long idCart , Long idProd){
        this.pr.deleteProductById(idCart,idProd);
    }

}
