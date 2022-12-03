/*
package com.example.backterra.Config;


import com.example.backterra.Entity.Store.PaymentMethod;
import com.example.backterra.Entity.Store.Product;
import com.example.backterra.repositories.PaymentMethodRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class PaymentMethodeConfig {

    @Bean
    CommandLineRunner commandLineRunner3(PaymentMethodRepository repository){
        return args -> {
            PaymentMethod paymentMethod1= new PaymentMethod(
                    1L,
                    "paypal"
                    );
            PaymentMethod paymentMethod2= new PaymentMethod(
                    2L,
                    "bank"
            );
            repository.saveAll(List.of(paymentMethod1,paymentMethod2));
        };
    }
}
*/
