/*
package com.example.backterra.Service;


import com.example.backterra.Entity.Store.PaymentMethod;
import com.example.backterra.repositories.PaymentMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentMethodeService {


    private final PaymentMethodRepository paymentMethodRepository;

    @Autowired
    public PaymentMethodeService(PaymentMethodRepository paymentMethodRepository) {
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public List<PaymentMethod> getStores(){
        return paymentMethodRepository.findAll();
    }

    public Optional<PaymentMethod> getStore(Long idPM){
        return paymentMethodRepository.findById(idPM);
    }
}
*/
