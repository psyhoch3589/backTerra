package com.example.backterra.Service;

import com.example.backterra.Entity.Store.PaymentMethod;
import com.example.backterra.Entity.Store.Store;
import com.example.backterra.repositories.PaymentMethodRepository;
import com.example.backterra.repositories.StoreRepository;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Objects;

@Service
public class StoreService {

    //payment methode stuff

    private final PaymentMethodRepository paymentMethodRepository ;




    public List<PaymentMethod> getpayms(){
        return paymentMethodRepository.findAll();
    }

    /*public Optional<PaymentMethod> getPayment(Long idPM){
        return paymentMethodRepository.findById(idPM);
    }*/

    /*public static void addMethodepayment(Long idmeth,Long idStore){
        Store store=storeRepository.findById(idStore)
                .orElseThrow(()->new IllegalStateException("student with id "+idStore+" doesn't exist"));

        PaymentMethod paymentMethod=paymentMethodRepository.findById(idmeth)
                .orElseThrow(()->new IllegalStateException("student with id "+idmeth+" doesn't exist"));

        store.addPaymentMethod(paymentMethod);

    }*/



    //store stuff
    private final StoreRepository storeRepository;

    //@Autowired working anyway
    public StoreService(StoreRepository storeRepository, PaymentMethodRepository paymentMethodRepository) {

        this.storeRepository = storeRepository;
        this.paymentMethodRepository = paymentMethodRepository;
    }

    public List<Store> getStores(){
        return storeRepository.findAll();
    }


    public void addNewStore(Store store) {
        storeRepository.save(store);
    }


    /*public Optional<Store> getStore(Long idStr){
        return storeRepository.findById(idStr);
    }*/



    public void deleteStore(Long storeId) {
        boolean exists = storeRepository.existsById(storeId);
        if(!exists){
            throw new IllegalStateException("store with id "+storeId+" doesn't exists");
        }
        storeRepository.deleteById(storeId);
    }


    @Transactional
    public void updateStore(Long storeId, String name, int traffic) {
        Store store=storeRepository.findById(storeId)
                .orElseThrow(()->new IllegalStateException("product with id "+storeId+" doesn't exist"));
        if(name != null && name.length()>0 && !Objects.equals(store.getName(),name)){
            store.setName(name);
        }

        if(traffic>0 && (store.getTraffic()!=traffic)){
            store.setTraffic(traffic);
        }
    }


    public Store testStr (){
        return storeRepository.findById(2L).get();
    }

}
