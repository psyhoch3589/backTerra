package com.example.backterra.Service;


import com.example.backterra.Entity.Store.Product;
import com.example.backterra.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class ProductService {
    @Autowired
    ProductRepository pr;

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    public void addNewProduct(Product product) {
        productRepository.save(product);
    }

    public void deleteProduct(Long productId) {
        boolean exists = productRepository.existsById(productId);
        if(!exists){
            throw new IllegalStateException("product with id "+productId+" doesn't exists");
        }
        productRepository.deleteById(productId);
    }

    @Transactional
    public void updateProduct(Long productId, String name, double prix) {
        Product product=productRepository.findById(productId)
                .orElseThrow(()->new IllegalStateException("product with id "+productId+" doesn't exist"));
        if(name != null && name.length()>0 && !Objects.equals(product.getTitle(),name)){
            product.setTitle(name);
        }

        if(prix>0 && (product.getPrix()!=prix)){
            product.setPrix(prix);
        }
    }

    public List<Product> showAllProducts(){
        return this.pr.findAll();
    }
    public Product save(Product product){
        return  this.pr.save(product);
    }
}
