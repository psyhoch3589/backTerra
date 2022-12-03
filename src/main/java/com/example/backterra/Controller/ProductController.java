package com.example.backterra.Controller;

import com.example.backterra.Entity.Store.Product;
import com.example.backterra.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping
    public List<Product> getProducts(){ return productService.getProducts();}

    @PostMapping
    public void registerNewProduct(@RequestBody Product product){ productService.addNewProduct(product);}

    @DeleteMapping(path = "{productId}")
    public void deleteProduct(@PathVariable("productId") Long productId){ productService.deleteProduct(productId);}

    @PutMapping(path = "{productId}")
    public void updateProduct(@PathVariable("productId") Long productId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) double prix){
        productService.updateProduct(productId,name,prix);
    }
}
