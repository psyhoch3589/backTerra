package Controller;


import Entity.user.User;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
    public User getUsers() {
        return new User(1,"anas","anasaziach@gmail.com","anas");
    }
}
