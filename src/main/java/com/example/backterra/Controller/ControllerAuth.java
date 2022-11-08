package com.example.backterra.Controller;


import com.example.backterra.Entity.user.StoreOwner;
import com.example.backterra.Entity.user.User;
import com.example.backterra.Service.UserService;
import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerAuth implements CommandLineRunner {
    @Autowired
    UserService service;
    
    @PostMapping(path = "/api/signup")
    public String signup(@RequestBody StoreOwner u) throws JSONException {
        JSONObject obj=new JSONObject();
        if(service.save(u)!=null){
            obj.put("status","ok");
        }
        else obj.put("status","nop");
        return obj.toString();
    }
    
    @PostMapping(path = "/api/login")
    public User login(User u){
        return service.findByEmail("Anasaziach@gmail.com");
    }

    @GetMapping(path = "/ok")
    public User test() throws JSONException {
        return service.findByEmail("Anasaziach@gmail.com");
    }

    @Override
    public void run(String... args) throws Exception {
        /*signup(new StoreOwner("zakariya2", null,null,null,null,null, null));
        signup(new StoreOwner("zakariya4", null,null,null,null,null, null));*/
    }
}
