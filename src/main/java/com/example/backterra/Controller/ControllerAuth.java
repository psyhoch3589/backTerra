package com.example.backterra.Controller;


import com.example.backterra.Entity.user.StoreOwner;
import com.example.backterra.Entity.user.User;
import com.example.backterra.Service.UserService;
import net.minidev.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAuth {
    @Autowired
    UserService service;
    
    @PostMapping(path = "/api/signup")
    public String signup(@RequestBody StoreOwner u) {
        JSONObject obj=new JSONObject();
        if(service.save(u)!=null){
            obj.put("status","ok");
        }
        else obj.put("status","nop");
        return obj.toString();
    }
}
