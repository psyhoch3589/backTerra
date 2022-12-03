package com.example.backterra.WebController;



import com.example.backterra.Entity.Store.Product;
import com.example.backterra.Service.CartService;
import com.example.backterra.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductControllerr {
    @Autowired
    ProductService ps;
    @Autowired
    CartService cs;
    @GetMapping(path = "api/fetchAllProducts")
    public List<Product> fetchAllProducts(){
        return ps.showAllProducts();
    }
    @PostMapping(path = "api/addProducts")
    public Product addProducts(@RequestBody Product product){
        return this.ps.save(product);
    }
    @GetMapping(path = "/api/test")
    public Product test(){
        return this.ps.showAllProducts().get(0);
    }
}
