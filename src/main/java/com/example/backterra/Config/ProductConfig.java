package com.example.backterra.Config;

import com.example.backterra.Entity.Store.Product;
import com.example.backterra.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


import java.util.List;

@Configuration
public class ProductConfig {
    /*@Bean
    CommandLineRunner commandLineRunner(ProductRepository repository){
        return args -> {
            Product product1 = new Product(
                    1L,
                    "hpx360",
                    23);
            Product product2 = new Product(
                    2L,
                    "hpPavillon",
                    22);

            repository.saveAll(List.of(product1,product2));
        };
    }*/
}
