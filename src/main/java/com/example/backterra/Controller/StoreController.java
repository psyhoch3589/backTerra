package com.example.backterra.Controller;


import com.example.backterra.Entity.Store.PaymentMethod;
import com.example.backterra.Entity.Store.Store;
import com.example.backterra.Service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "api/v1/store")
public class StoreController {

    @Autowired
    private StoreService storeService;

    @GetMapping(path = "/test")
    public List<PaymentMethod> getpaymes(){ return storeService.getpayms();}




    @GetMapping
    public List<Store> getStores(){ return storeService.getStores();}

    @PostMapping
    public void registerNewStore(@RequestBody Store store){ storeService.addNewStore(store);}

    @DeleteMapping(path = "{storeId}")
    public void deleteStore(@PathVariable("storeId") Long storeId){ storeService.deleteStore(storeId);}

    @PutMapping(path = "{storeId}")
    public void updateStore(@PathVariable("storeId") Long storeId,
                              @RequestParam(required = false) String name,
                              @RequestParam(required = false) int traffic){
        storeService.updateStore(storeId,name,traffic);
    }

    @GetMapping(path = "/API")
    public Store getStr(){ return storeService.testStr();}

}
