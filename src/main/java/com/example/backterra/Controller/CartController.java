package com.example.backterra.Controller;



import com.example.backterra.Entity.Store.Cart;
import com.example.backterra.Entity.Store.Product;
import com.example.backterra.Service.CartService;
import com.example.backterra.repositories.ProductRepository;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
public class CartController {
    @Autowired
    CartService cs;
    @Autowired
    ProductRepository pr;

    public boolean fillOrderByProducts(@RequestBody List<Product> products, @RequestBody Cart cart){
        return this.cs.fillCommandByProducts(products,cart);
    }
    @GetMapping(path = "/api/showOnGoingOrder")
    public List<Product> showOnGoingOrder(@RequestParam("idCart") Long idCart) throws InstantiationException, IllegalAccessException {
        return this.cs.showOnGoingCommand(idCart);
    }

    @DeleteMapping(path = "/api/deleteProductFromOrderById")
    public String deleteProductById(@RequestParam("idCart") Long idCart , @RequestParam("idProd") Long idProd) {
        JSONObject obj=new JSONObject();
        this.cs.deleteProductById(idCart,idProd);
        obj.put("status",1);
        return obj.toString();
    }


    @DeleteMapping(path = "/api/deleteProductFromOrder")
    public void deleteAllProductsFromOrder(@RequestParam("id") Long id){
        //this.cs.deleteAllProductsFromOrder(id);
    }
}