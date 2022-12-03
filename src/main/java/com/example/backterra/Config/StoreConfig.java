package com.example.backterra.Config;


import com.example.backterra.Entity.Store.PaymentMethod;
import com.example.backterra.Entity.Store.Store;
import com.example.backterra.repositories.PaymentMethodRepository;
import com.example.backterra.repositories.StoreRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;


@Configuration
public class StoreConfig {

    /*@Bean
    CommandLineRunner commandLineRunner2(StoreRepository repository, PaymentMethodRepository repository2){
        return args -> {
            Store store1 = new Store(
                    1L,
                    "hamidStore",
                    23000);
            Store store2 = new Store(
                    2L,
                    "khalidStore",
                    220000);

            repository.saveAll(List.of(store1,store2));

            PaymentMethod paymentMethod1= new PaymentMethod(
                    1L,
                    "paypal"
            );
            PaymentMethod paymentMethod2= new PaymentMethod(
                    2L,
                    "banka"
            );


            paymentMethod1.setStores(store1);

            paymentMethod1.setStores(store2);


            paymentMethod2.setStores(store1);



            repository2.saveAll(List.of(paymentMethod1,paymentMethod2));

        };

    }*/
}

